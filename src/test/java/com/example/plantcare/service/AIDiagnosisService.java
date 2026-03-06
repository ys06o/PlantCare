package com.example.plantcare.service;

import com.example.plantcare.dto.AIDiagnosisDto;
import com.example.plantcare.entity.AIDiagnosisEntity;
import com.example.plantcare.repository.AIDiagnosisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AIDiagnosisService {
    @Autowired private AIDiagnosisRepository aiDiagnosisRepository;

    // 전체적으로 AI진단한 결과 및 내용 등 전체 출력 ( 관리자용 ) 모든 사용자의 진단결과 출력
    // 안쓸수도 있음
    public List<AIDiagnosisEntity> findAll(){
        List<AIDiagnosisEntity> AIList=aiDiagnosisRepository.findAll();
        List<AIDiagnosisDto> AIDtoList=new ArrayList<>();
        AIList.forEach(entity->{
            AIDtoList.add(entity.toDto());
        });
        return AIList;
    }

    // 1. 특정 사용자의 진단목록( 전체 )
    public List<AIDiagnosisDto> UserFindAll(int userId){
        // 각 유저의 자신의 진단기록을 리스트에 넣은 코드
        List<AIDiagnosisEntity> AIEntityList=aiDiagnosisRepository.findByPlant_User_UserId(userId);
        List<AIDiagnosisDto> AIDtoList=new ArrayList<>();
        AIEntityList.forEach(entity->{
            AIDtoList.add(entity.toDto());
        });
        return AIDtoList;
    }

    // 1번을 이용한 진단목록 상세 조회
}
