package com.life.tracker.api.beckend.entity;

import jakarta.persistence.Entity;
import lombok.*;

@Builder
@AllArgsConstructor
@Getter
@Setter
public class EducationSummary {
    private  long totalRecords;
    private  long degrees;
    private  long certification;
    private  long courses;
    private  long completed;
    private  long ongoing;
}
