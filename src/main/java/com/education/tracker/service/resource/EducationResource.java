package com.education.tracker.service.resource;

import com.education.tracker.service.entity.EducationEntity;
import com.education.tracker.service.entity.EducationSummary;
import com.education.tracker.service.entity.EducationType;
import com.education.tracker.service.representation.EducationRecordRequest;
import com.education.tracker.service.service.EducationService;
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

    @PostMapping
    public ResponseEntity<List<EducationEntity>> create(
            @RequestBody List<EducationRecordRequest> requests) {
        return ResponseEntity.ok(educationService.create(requests));
    }

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

    @GetMapping("/summary")
    public ResponseEntity<EducationSummary> getSummary(){
        return  ResponseEntity.ok(educationService.getEducationSummary());
    }

}
