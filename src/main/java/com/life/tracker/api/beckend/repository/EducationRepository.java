package com.life.tracker.api.beckend.repository;

import com.life.tracker.api.beckend.entity.EducationEntity;
import com.life.tracker.api.beckend.entity.EducationSummary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EducationRepository extends JpaRepository<EducationEntity,Integer> {
    public List<EducationEntity> findAll();
    public  List<EducationEntity> findByType(String type);
    public List<EducationEntity> findAllByOrderByStartDate();

    @Query(value = """
        SELECT
            COUNT(user_id)  AS totalRecords,
            COUNT( case when type='degree' then type end ) AS certification,
            COUNT( case when type='certification' then type end ) AS certification,
            COUNT( case when type='course' then type end ) AS course,
            COUNT( case when status='completed' then status end ) AS completed,
            COUNT( case when status='ongoing' then status end ) AS ongoing
        FROM life_tracker.education_record
    """, nativeQuery = true)
    public EducationSummary getRecordsSummary();
}
