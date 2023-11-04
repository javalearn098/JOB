package com.jobportal.jobsearch.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jobportal.jobsearch.entity.JobDetails;

@Repository
public interface JobDetailsRepositry extends JpaRepository<JobDetails, Integer> {
	
}
