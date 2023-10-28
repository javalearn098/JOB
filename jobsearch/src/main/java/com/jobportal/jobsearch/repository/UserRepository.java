package com.jobportal.jobsearch.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jobportal.jobsearch.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

}
