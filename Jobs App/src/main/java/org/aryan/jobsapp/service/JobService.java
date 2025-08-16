package org.aryan.jobsapp.service;

import org.aryan.jobsapp.model.JobPost;
import org.aryan.jobsapp.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class JobService {

    @Autowired
    private JobRepo repo;
    public void addJob(JobPost jobPost) {
        repo.addJob(jobPost);

    }

    public List<JobPost> getJobs() {
        return repo.getAllJobs();
    }
}
