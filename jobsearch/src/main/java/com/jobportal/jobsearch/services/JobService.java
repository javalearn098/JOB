package com.jobportal.jobsearch.services;

import java.util.List;

import com.jobportal.jobsearch.entity.JobDetails;
import com.jobportal.jobsearch.repository.JobDetailsRepositry;

public interface JobService {

	public String postJobDetails(JobDetails details);

	public List<JobDetails> getJobPostsList();
}
