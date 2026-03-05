package com.example.plantcare.dto;

import com.example.plantcare.entity.AIDiagnosisEntity;
import com.example.plantcare.entity.GrowthLogEntitiy;
import com.example.plantcare.entity.MyPlantEntitiy;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data@AllArgsConstructor@NoArgsConstructor@Builder
public class GrowthLogDto {
    private Long logId;
    private Integer plantId;
    private Long diagnosisId;
    private String title;
    private String photoUrl;
    private String logDate;
    private String content;
    private String createDate;
    private String updateDate;

    public GrowthLogEntitiy toEntity(MyPlantEntitiy plant, AIDiagnosisEntity aiDiagnosis) {
        return GrowthLogEntitiy.builder()
                .plant(plant)
                .aiDiagnosis(aiDiagnosis)
                .title(this.title)
                .photoUrl(this.photoUrl)
                .logDate(logDate != null ? LocalDate.parse(this.logDate) : null)
                .content(this.content)
                .build();
    }
}
