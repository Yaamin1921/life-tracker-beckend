package com.education.tracker.service.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
public enum EducationType {
    DEGREE("degree"),
    CERTIFICATION("certification"),
    COURSE("course"),
    EXAM("exam");

    private final String educationType;

    EducationType(String educationType) {
        this.educationType = educationType;
    }
}
