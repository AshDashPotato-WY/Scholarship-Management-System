package com.example.bright_scholarship.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Builder
@Entity
@Table(name = "applicants")
@AllArgsConstructor
@NoArgsConstructor
public class Applicant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    @NotBlank(message = "Student Number is required")
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

    @Column(name = "created_at")
    private final LocalDateTime createAt = LocalDateTime.now();

}
