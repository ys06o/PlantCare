package com.example.plantcare.service;

import com.example.plantcare.repository.AIDiagnosisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AIDiagnosisService {
    @Autowired private AIDiagnosisRepository aiDiagnosisRepository;
}
