package com.jobportal.jobsearch.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jobportal.jobsearch.entity.Organization;

@Repository
public interface OrgRepository extends JpaRepository<Organization, Integer>{

	  public Organization findByEmailAndPassword(String email, String password);
}
