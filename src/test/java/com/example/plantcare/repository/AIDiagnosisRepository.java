package com.example.plantcare.repository;

import com.example.plantcare.entity.AIDiagnosisEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AIDiagnosisRepository
        extends JpaRepository<AIDiagnosisEntity,Integer> {
}
