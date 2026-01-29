package com.life.tracker.api.beckend.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import org.hibernate.annotations.IdGeneratorType;

import javax.xml.validation.Schema;
import java.time.LocalDate;
@Getter
@Data
@Entity
@Table(name="education_record",schema = "life_tracker")
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
