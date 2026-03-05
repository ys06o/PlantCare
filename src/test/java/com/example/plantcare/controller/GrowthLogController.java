package com.example.plantcare.controller;

import com.example.plantcare.service.GrowthLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GrowthLogController {
    @Autowired private GrowthLogService growthLogService;
}
