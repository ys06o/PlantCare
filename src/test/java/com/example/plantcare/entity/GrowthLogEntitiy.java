package com.example.plantcare.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data@AllArgsConstructor@NoArgsConstructor
@Entity@Table(name = "GrowthLog")
public class GrowthLogEntitiy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "log_id")
    private Long logId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "plant_id", nullable = false)
    private MyPlantEntitiy plant;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "diagnosis_id")
    private AIDiagnosisEntity aiDiagnosis;

    @Column(name = "title", length = 255)
    private String title;

    @Column(name = "photo_url", length = 255)
    private String photoUrl;

    @Column(name = "log_date", nullable = false)
    private LocalDate logDate;

    @Column(name = "content", columnDefinition = "TEXT")
    private String content;
}
