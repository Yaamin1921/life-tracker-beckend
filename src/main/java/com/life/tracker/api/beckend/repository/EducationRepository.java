package com.life.tracker.api.beckend.repository;

import com.life.tracker.api.beckend.entity.EducationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EducationRepository extends JpaRepository<EducationEntity,Integer> {
    public List<EducationEntity> findAll();
    public  List<EducationEntity> findByType(String type);
    public List<EducationEntity> findAllByOrderByStartDate();
}
