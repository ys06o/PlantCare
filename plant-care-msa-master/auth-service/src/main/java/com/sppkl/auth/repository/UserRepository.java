package com.example.plantcare.repository;

import com.example.plantcare.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository
        extends JpaRepository<UserEntity,Integer> {
}
