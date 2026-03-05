package com.example.plantcare.service;

import com.example.plantcare.repository.SensorDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SensorDataService {
    @Autowired private SensorDataRepository sensorDataRepository;
}
