package com.example.bright_scholarship.controller;


import com.example.bright_scholarship.model.Applicant;
import com.example.bright_scholarship.repository.ApplicantRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/applicants")
public class ApplicantController {
    @Autowired
    private ApplicantRepo applicantRepo;

    // get all applicants
    @GetMapping("/all")
    public List<Applicant> getAllEmployees() {
        return applicantRepo.findAll();    // perform a 'select* from' SQL call to the database
    }


}
