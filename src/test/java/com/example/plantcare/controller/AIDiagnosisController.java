package com.example.plantcare.controller;

import com.example.plantcare.dto.AIDiagnosisDto;
import com.example.plantcare.service.AIDiagnosisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AIDiagnosisController {
    @Autowired private AIDiagnosisService aiDiagnosisService;

    @GetMapping("/Ai")
    public List<AIDiagnosisDto> User_AIList(@RequestParam int userId){
        return aiDiagnosisService.User_AIList(userId);
    }   //GET /diagnosis?userId=1        → 유저의 진단목록 전체

    @GetMapping("/diagnosis/{diagnosisId}")
    public AIDiagnosisDto User_Details(@PathVariable Long diagnosisId){
        return aiDiagnosisService.User_Details(diagnosisId);
    }   // GET /diagnosis/5               → 진단 상세조회
}
