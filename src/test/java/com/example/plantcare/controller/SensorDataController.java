package com.example.plantcare.controller;

import com.example.plantcare.service.SensorDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SensorDataController {
    @Autowired private SensorDataService sensorDataService;
}
