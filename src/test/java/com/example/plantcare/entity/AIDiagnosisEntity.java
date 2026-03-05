package com.example.plantcare.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "AIDiagnosis")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AIDiagnosisEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "diagnosis_id")
    private Long diagnosisId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "plant_id", nullable = false)
    private MyPlantEntitiy plant;

    @Column(name = "details", columnDefinition = "TEXT")
    private String details;

    @Column(name = "result", length = 50)
    private String result;

    @Column(name = "image_url", length = 255)
    private String imageUrl;

    @Column(name = "diagnosis_date", nullable = false)
    private LocalDateTime diagnosisDate = LocalDateTime.now();
}