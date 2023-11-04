package com.jobportal.jobsearch.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jobportal.jobsearch.entity.JobDetails;
import com.jobportal.jobsearch.repository.JobDetailsRepositry;

@Service
public class JobServiceImpl implements JobService {

	@Autowired
	JobDetailsRepositry jobDetailsRepositry;

	@Override
	public String postJobDetails(JobDetails details) {

		JobDetails save = jobDetailsRepositry.save(details);

		if (save != null) {

			return "Job posted successfully...!";
		}

		return "Failed to Post Job details....";
	}

	@Override
	public List<JobDetails> getJobPostsList() {

		List<JobDetails> jobList = jobDetailsRepositry.findAll();

		return jobList;
	}

}
