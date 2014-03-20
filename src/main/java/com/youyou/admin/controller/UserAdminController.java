package com.youyou.admin.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.youyou.admin.entity.Role;
import com.youyou.admin.entity.User;
import com.youyou.admin.search.SearchBean;
import com.youyou.admin.search.SearchResult;
import com.youyou.admin.service.AccountService;
import com.youyou.admin.service.ActionLogService;
import com.youyou.admin.service.RoleService;
import com.youyou.admin.utils.WebUtils;



@Controller
@RequestMapping(value="/admin/user")
public class UserAdminController {
	
	@Autowired
	private AccountService accountService;
	@Autowired
	private RoleService roleService;
	@Autowired
	private ActionLogService actionLogService;
	
	@RequestMapping(method=RequestMethod.GET)
	public String show(){
		return "/account/adminUserList";
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public @ResponseBody SearchResult list(SearchBean search){
		Page<User> pageUser = accountService.getUsersByPageInfo(search);
		SearchResult result = new SearchResult();
		result.setAaData(pageUser.getContent());
		long total = pageUser.getTotalElements();
		result.setiTotalDisplayRecords(total);
		result.setiTotalRecords(total);
		result.setsEcho(search.getsEcho());
		return result;
	}
	
	@RequestMapping(value="/add")
	public String update(Model model){
		List<Role> roles = roleService.getAllRoles();
		model.addAttribute("rolesSel", roles);
		return "account/adminUserForm";
	}
	
	@RequestMapping(value="/create")
	public String create(User user,@RequestParam String roleids,HttpServletRequest request){
		String rolenames = "";
		if(roleids != null && !roleids.trim().equals("")){
			String[]ids = roleids.split(",");
			List<Role> roles = new ArrayList<Role>();
			for(int i=0;i<ids.length;i++){
				Role role  = roleService.getRoleById(Long.parseLong(ids[i]));
				roles.add(role);
				if(i==0){
					rolenames = role.getName();
				}else{
					rolenames = rolenames + "," +role.getName();
				}
			}
			user.setRoles(roles);
			user.setRolename(rolenames);
		}
		accountService.registerUser(user);
		actionLogService.addLog("创建用户", user.toString(), WebUtils.getIpAddr(request));
		return "/account/adminUserList";
	}
	
	@RequestMapping(value="view/{id}")
	public String view(@PathVariable("id") Long id,Model model){
		model.addAttribute("user",accountService.getUser(id));
		model.addAttribute("model","view");
		return "/account/adminUserEditForm";
	}
	
	@RequestMapping(value="delete/{id}")
	public String delete(@PathVariable("id") Long id,Model model,HttpServletRequest request){
		actionLogService.addLog("删除用户", "deleteUser:"+id, WebUtils.getIpAddr(request));
		accountService.deleteUser(id);
		return "redirect:/admin/user";
	}
	
	@RequestMapping(value="edit/{id}")
	public String edit(@PathVariable("id") Long id,Model model){
		List<Role> roles = roleService.getAllRoles();
		model.addAttribute("rolesSel", roles);
		model.addAttribute("user",accountService.getUser(id));
		return "/account/adminUserEditForm";
	}
	
	@RequestMapping(value="update")
	public String updateUser(User user,@RequestParam String roleids,HttpServletRequest request){
		String rolenames = "";
		User oUser = accountService.getUser(user.getId());
		oUser.setUsername(user.getUsername());
		oUser.setRealname(user.getRealname());
		oUser.setDepartment(user.getDepartment());
		oUser.setMobilephone(user.getMobilephone());
		oUser.setTelephone(user.getTelephone());
		if(roleids != null && !roleids.trim().equals("")){
			if(!roleids.equals("unchange")){
				String[]ids = roleids.split(",");
				List<Role> roles = new ArrayList<Role>();
				for(int i=0;i<ids.length;i++){
					Role role  = roleService.getRoleById(Long.parseLong(ids[i]));
					roles.add(role);
					if(i==0){
						rolenames = role.getName();
					}else{
						rolenames = rolenames + "," +role.getName();
					}
				}
				oUser.setRoles(roles);
				oUser.setRolename(rolenames);
			}
		}else{
			oUser.setRoles(new ArrayList<Role>());
			oUser.setRolename(rolenames);
		}
		actionLogService.addLog("更新用户", user.toString()+"change to:"+oUser.toString(), WebUtils.getIpAddr(request));
		accountService.updateUser(oUser);
		return "/account/adminUserList";
	}
	
	@RequestMapping(value="/checkUsername")
	public void checkUsername(@RequestParam("username") String username,@RequestParam(value="id",required=false) String id,HttpServletResponse response){
		User user = accountService.findUserByUsername(username);
		String result = null;
		if(user == null){
			result = "true";
		}else if (id != null && user.getId() == Long.parseLong(id)) {
			result = "true";
		}else{
			result = "false";
		}
		try {
			response.getWriter().write(result);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
