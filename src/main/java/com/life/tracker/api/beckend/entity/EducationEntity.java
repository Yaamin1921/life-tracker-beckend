package com.life.tracker.api.beckend.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.IdGeneratorType;

import java.time.LocalDate;

@Entity
@Table(name="education_record")
public class EducationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;

     @Column(name="user_id")
    private  int userId;
     @Column(name="type")
    private  String type;
     @Column(name="title")
    private  String title;
     @Column(name="institution")
    private  String institution;
     @Column(name="start_date")
    private LocalDate startDate;
     @Column(name="end_date")
    private  LocalDate endDate;
     @Column(name="status")
    private  String status;
     @Column(name="score_or_grade")
    private  String scoreOrGrade;
     @Column(name="description")
    private String description;

}
