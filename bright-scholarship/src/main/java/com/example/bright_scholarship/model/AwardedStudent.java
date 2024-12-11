package com.example.bright_scholarship.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@Entity
@Table(name = "awarded")
@AllArgsConstructor
@NoArgsConstructor
public class AwardedStudent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    @NotBlank(message = "Student ID is required")
    private String studentId;
    private String fullName;
    private double awardedAmount;

    @Column(name = "created_at")
    private final LocalDateTime createAt = LocalDateTime.now();
}
