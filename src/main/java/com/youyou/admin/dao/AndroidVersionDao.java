package com.youyou.admin.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import com.youyou.admin.entity.AndroidVersion;



public interface AndroidVersionDao extends PagingAndSortingRepository<AndroidVersion,Long>{
	
	@Query("select v from AndroidVersion v where v.name like %:name% or v.version like %:name%")
	public Page<AndroidVersion> findBySearch(@Param("name") String name,Pageable pageable);
}
