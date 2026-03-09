package com.example.plantcare.service;

import com.example.plantcare.repository.GrowthLogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GrowthLogService {
    @Autowired private GrowthLogRepository growthLogRepository;
}
