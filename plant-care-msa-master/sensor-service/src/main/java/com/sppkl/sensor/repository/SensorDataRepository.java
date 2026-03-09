package com.example.plantcare.repository;

import com.example.plantcare.entity.SensorDataEntitiy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SensorDataRepository
        extends JpaRepository<SensorDataEntitiy,Integer> {
}
