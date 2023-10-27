package com.jobportal.jobsearch.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jobportal.jobsearch.entity.AdminEntity;


@Repository
public interface AdminRepository extends JpaRepository<AdminEntity, Integer>{
	
}
