package com.youyou.admin.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.youyou.admin.entity.Permission;



public interface PermissionDao extends CrudRepository<Permission, Long>{
	
	@Query("select p from Permission p inner join p.roles r where r.id = ?1")
	public List<Permission> findChosedPermissionByRole(Long id);
	
	public List<Permission> findByIdIn(List<Long> ids);
}
