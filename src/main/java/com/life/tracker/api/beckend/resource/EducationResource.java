package com.life.tracker.api.beckend.resource;

import com.life.tracker.api.beckend.entity.EducationEntity;
import com.life.tracker.api.beckend.entity.EducationType;
import com.life.tracker.api.beckend.service.EducationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/education")
@ResponseBody
public class EducationResource {
    @Autowired
    private EducationService educationService;

    @GetMapping
    public ResponseEntity<List<EducationEntity>> getAllRecords(){
        return new ResponseEntity<>(educationService.getAllRecords(),HttpStatus.OK);
    }
    @GetMapping("type/{type}")
    public ResponseEntity<List<EducationEntity>> getAllRecordsById(@PathVariable(name="type") EducationType name){
        return new ResponseEntity<>(educationService.getRecordsByType(name),HttpStatus.OK);
    }

    @GetMapping("/timeline")
    public ResponseEntity<List<EducationEntity>> getAllRecordsByTimeline(){
        return new ResponseEntity<>(educationService.getRecordsByTypeTimeline(),HttpStatus.OK);
    }

}
