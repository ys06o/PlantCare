package com.example.plantcare.controller;

import com.example.plantcare.service.MyPlantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyPlantController {
    @Autowired private MyPlantService myPlantService;
}
