package com.youyou.admin.service;

import java.util.Date;

import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import com.youyou.admin.dao.AndroidVersionDao;
import com.youyou.admin.entity.AndroidVersion;
import com.youyou.admin.search.SearchBean;



@Component
public class AndroidVersionService {

	@Autowired
	private AndroidVersionDao androidVersionDao;
	
	public Page<AndroidVersion> getVersionsByPageInfo(SearchBean search) {
		Pageable pageable = new PageRequest(search.getPage(), search.getiDisplayLength());
		if(search.getsSearch()!=null && !search.getsSearch().equals("")){
			return androidVersionDao.findBySearch( search.getsSearch(),pageable);
		}else{
			return androidVersionDao.findAll(pageable);
		}
	}
	
	public AndroidVersion update(AndroidVersion version){
		version.setCreateBy(SecurityUtils.getSubject().getPrincipal().toString());
		version.setCreateTime(new Date());
		return androidVersionDao.save(version);
	}
	
	public void delete(Long id){
		androidVersionDao.delete(id);
	}

}
