package com.life.tracker.api.beckend.service;

import com.life.tracker.api.beckend.entity.EducationEntity;
import com.life.tracker.api.beckend.entity.EducationSummary;
import com.life.tracker.api.beckend.entity.EducationType;
import com.life.tracker.api.beckend.repository.EducationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EducationService {
    @Autowired
    private EducationRepository educationRepository;

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
