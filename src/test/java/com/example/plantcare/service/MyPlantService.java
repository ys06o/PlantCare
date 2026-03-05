package com.example.plantcare.service;

import com.example.plantcare.repository.MyPlantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyPlantService {
    @Autowired private MyPlantRepository myPlantRepository;
}
