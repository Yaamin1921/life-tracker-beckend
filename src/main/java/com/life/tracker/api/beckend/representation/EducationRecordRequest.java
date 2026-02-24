package com.life.tracker.api.beckend.representation;

import lombok.Data;

import java.time.LocalDate;
    @Data
    public class EducationRecordRequest {

        private Long userId;
        private String type;
        private String title;
        private String institution;
        private LocalDate startDate;
        private LocalDate endDate;
        private String status;
        private String scoreOrGrade;
        private String description;

}
