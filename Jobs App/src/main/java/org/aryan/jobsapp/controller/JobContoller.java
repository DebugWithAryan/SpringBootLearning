package org.aryan.jobsapp.controller;

import org.aryan.jobsapp.model.JobPost;
import org.aryan.jobsapp.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class JobContoller {

    @Autowired
    private JobService service;

    @GetMapping({"/","home"})
    public String home(){
        return "home";
    }

    @GetMapping("addjob")
    public String addJob(){
        return "addjob";
    }

    @PostMapping("handleForm")
    public String handleForm(JobPost jobPost){

        service.addJob(jobPost);
        return "success";
    }

    @GetMapping("viewalljobs")
    public String viewJob(Model model){
        List<JobPost> jobs = service.getJobs();
        model.addAttribute("jobPosts", jobs);
        return "viewalljobs";
    }
}
