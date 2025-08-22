package org.aryan.jobsapp.controller;
import java.util.List;


import org.aryan.jobsapp.model.JobPost;
import org.aryan.jobsapp.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class JobContoller {

        @Autowired
        private JobService service;

        @GetMapping({"/", "home"})
        public String home() {
            return "home";
        }

        @GetMapping("jobPosts")
        public List<JobPost> getAllJobs() {
            return service.getJobs();
        }

        @GetMapping("viewalljobs")
        public String viewAllJobs(Model model, @RequestParam(name = "keyword", required = false) String keyword) {
            List<JobPost> jobPosts;
            if (keyword != null && !keyword.isEmpty()) {
                jobPosts = service.search(keyword);
            } else {
                jobPosts = service.getJobs();
            }
            model.addAttribute("jobPosts", jobPosts);
            return "viewalljobs";
        }

        @GetMapping("/jobPost/{postId}")
        public JobPost getJob(@PathVariable int postId) {
            return service.getJob(postId);
        }

        @GetMapping("jobPost/keyword/{keyword}")
        public List<JobPost> searchByKeyword(@PathVariable("keyword") String keyword) {
            return service.search(keyword);
        }

        @PostMapping("jobPost")
        public JobPost addJob(@RequestBody JobPost jobPost) {
            service.addJob(jobPost);
            return service.getJob(jobPost.getPostId());
        }

        @GetMapping("addjob")
        public String addJob() {
            return "addjob";
        }

        @PostMapping("handleForm")
        public String handleForm(JobPost jobPost, Model model) {
            service.addJob(jobPost);
            model.addAttribute("jobPost", jobPost);
            return "success";
        }


        @GetMapping("updatejob/{postId}")
        public String showUpdateForm(@PathVariable int postId, Model model){
            JobPost jobPost = service.getJob(postId);
            model.addAttribute("jobPost", jobPost);
            return "update";
        }


        @PostMapping("updateJob")
        public String updateJob(JobPost jobPost) {
            service.updateJob(jobPost);
            return "redirect:/viewalljobs";
        }

        @GetMapping("deletejob/{postId}")
        public String showDeleteConfirmation(@PathVariable int postId, Model model) {
            JobPost jobPost = service.getJob(postId);
            model.addAttribute("jobPost", jobPost);
            return "delete";
        }

        @PostMapping("deleteJob")
        public String deleteJob(@RequestParam int postId) {
            service.deleteJob(postId);
            return "redirect:/viewalljobs";
        }

        @GetMapping("load")
        public String loadData() {
            service.load();
            return "success";
        }


}