package com.example.plantcare.controller;

import com.example.plantcare.service.AIDiagnosisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AIDiagnosisController {
    @Autowired private AIDiagnosisService aiDiagnosisService;
}
