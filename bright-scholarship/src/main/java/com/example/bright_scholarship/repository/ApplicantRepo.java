package com.example.bright_scholarship.repository;

import com.example.bright_scholarship.model.Applicant;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ApplicantRepo extends JpaRepository<Applicant, Long> {
    Optional<Applicant> findByEmail(String email);
    List<Applicant> findByIsEligible(boolean isEligible); // return a list of eligible students
    Optional<Applicant> findByStudentNumber(String studentNumber);
}
