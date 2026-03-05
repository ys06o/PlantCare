package com.example.plantcare.repository;

import com.example.plantcare.entity.GrowthLogEntitiy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GrowthLogRepository
        extends JpaRepository<GrowthLogEntitiy,Integer> {
}
