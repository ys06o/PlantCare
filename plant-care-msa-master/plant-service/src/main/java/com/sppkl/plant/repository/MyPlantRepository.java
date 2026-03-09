package com.example.plantcare.repository;

import com.example.plantcare.entity.MyPlantEntitiy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyPlantRepository
        extends JpaRepository<MyPlantEntitiy,Integer> {
}
