package com.example.bright_scholarship.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class AwardedStudentDto {
    private Long id;
    private String studentId;
    private String fullName;
    private double awardedAmount;

}
