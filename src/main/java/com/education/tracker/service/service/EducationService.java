package com.education.tracker.service.service;

import com.education.tracker.service.entity.EducationEntity;
import com.education.tracker.service.entity.EducationSummary;
import com.education.tracker.service.entity.EducationType;
import com.education.tracker.service.repository.EducationRepository;
import com.education.tracker.service.representation.EducationRecordRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EducationService {
    @Autowired
    private EducationRepository educationRepository;

    public List<EducationEntity> create(List<EducationRecordRequest> requests) {

        var records = requests.stream().map(request->EducationEntity.builder()
                .userId(Math.toIntExact(request.getUserId()))
                .type(request.getType())
                .title(request.getTitle())
                .institution(request.getInstitution())
                .startDate(request.getStartDate())
                .endDate(request.getEndDate())
                .status(request.getStatus())
                .scoreOrGrade(request.getScoreOrGrade())
                .description(request.getDescription())
                .build()).toList();

        return educationRepository.saveAll(records);
    }

    public List<EducationEntity> getAllRecords(){
        return educationRepository.findAll();
    }
    public List<EducationEntity> getRecordsByType(EducationType educationType /*String courseType*/){
        String courseType= educationType.getEducationType().toUpperCase();
        return educationRepository.findByType(courseType);
    }
    public List<EducationEntity> getRecordsByTypeTimeline(){
        return educationRepository.findAllByOrderByStartDate();
    }
    public EducationSummary getEducationSummary(){
        return  educationRepository.getRecordsSummary();

    }


}
