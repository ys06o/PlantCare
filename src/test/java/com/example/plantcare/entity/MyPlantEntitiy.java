package com.example.plantcare.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "MyPlant")
@Data@AllArgsConstructor@NoArgsConstructor
public class MyPlantEntitiy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY.IDENTITY)
    @Column(name = "plant_id")
    private Integer plantId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private UserEntity user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "species_code", nullable = false)
    private PlantBookEntitiy plantBook;

    @Column(name = "nickname", length = 100)
    private String nickname;

    @Column(name = "adoption_date")
    private LocalDate adoptionDate;
}
