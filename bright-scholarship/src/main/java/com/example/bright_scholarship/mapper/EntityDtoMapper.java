package com.example.bright_scholarship.mapper;

import com.example.bright_scholarship.dto.ApplicantDto;
import com.example.bright_scholarship.model.Applicant;
import org.springframework.stereotype.Component;

@Component
public class EntityDtoMapper {
    // map Applicants to Dto
    public ApplicantDto mapApplicantToDto(Applicant applicant) {
        ApplicantDto applicantDto = new ApplicantDto();
        applicantDto.setStudentNumber(applicant.getStudentNumber());
        applicantDto.setFirstName(applicant.getFirstName());
        applicantDto.setLastName(applicant.getLastName());
        applicantDto.setPhoneNumber(applicant.getPhoneNumber());
        applicantDto.setEmail(applicant.getEmail());
        applicantDto.setGender(applicant.getGender());
        applicantDto.setDateOfBirth(applicant.getDateOfBirth());
        applicantDto.setStatus(applicant.getStatus());
        applicantDto.setCumulativeGpa(applicant.getCumulativeGpa());
        applicantDto.setCreditHours(applicant.getCreditHours());
        return applicantDto;
    }
}
