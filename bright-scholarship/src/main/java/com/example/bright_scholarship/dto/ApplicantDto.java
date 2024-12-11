package com.example.bright_scholarship.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApplicantDto {

    private Long id;
    private String studentNumber;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
    private String gender;
    private LocalDate dateOfBirth;
    private String status; // Freshman, Sophomore, etc.
    private double cumulativeGpa;
    private int creditHours;
    private boolean isEligible;
}
