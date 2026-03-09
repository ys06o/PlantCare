package com.example.plantcare.repository;

import com.example.plantcare.entity.PlantBookEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlantBookRepository
        extends JpaRepository<PlantBookEntity,Integer> {
}
