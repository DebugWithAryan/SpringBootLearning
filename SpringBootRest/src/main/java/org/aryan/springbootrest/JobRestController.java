package org.aryan.springbootrest;


import jakarta.servlet.ServletRequest;
import org.aryan.springbootrest.model.JobPost;
import org.aryan.springbootrest.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "")//For connection backend with frontend, put link
public class JobRestController {

    @Autowired
    private JobService jobService;

    @GetMapping("jobPosts")
    public List<JobPost> getAllJobs(){
        return jobService.getJobs();
    }

    @GetMapping("jobPost/{postId}")
    public JobPost getJob(@PathVariable("postId") int postId){
        return jobService.getJob(postId);
    }

    @PostMapping("jobPost")
    public JobPost addJob(@RequestBody JobPost jobPost){
        jobService.addJob(jobPost);
        return jobService.getJob(jobPost.getPostId());

    }

    @PutMapping("jobPost")
    public JobPost updateJob(@RequestBody JobPost jobPost){
        jobService.updateJob(jobPost);
        return jobService.getJob(jobPost.getPostId());
    }

    @DeleteMapping("jobPost/{}")
    public String deleteJob(@PathVariable("postId") int postId){
        jobService.deleteJob(postId);
        return "Job deleted";
    }
}
