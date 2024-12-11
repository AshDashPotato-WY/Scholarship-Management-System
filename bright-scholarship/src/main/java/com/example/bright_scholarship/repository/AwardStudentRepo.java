package com.example.bright_scholarship.repository;

import com.example.bright_scholarship.model.AwardedStudent;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AwardStudentRepo extends JpaRepository<AwardedStudent, Long> {
    Optional<AwardedStudent> findByEmail(String email);
}
