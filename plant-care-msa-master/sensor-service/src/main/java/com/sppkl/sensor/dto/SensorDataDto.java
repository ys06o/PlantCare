package com.example.plantcare.dto;

import com.example.plantcare.entity.MyPlantEntitiy;
import com.example.plantcare.entity.SensorDataEntitiy;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data@AllArgsConstructor@NoArgsConstructor@Builder
public class SensorDataDto {
    private Long sensorDataId;
    private Integer plantId;
    private BigDecimal temperature;
    private BigDecimal humidity;
    private BigDecimal soilMoisture;
    private String measuredTime;
    private String createDate;
    private String updateDate;

    public SensorDataEntitiy toEntity(MyPlantEntitiy plant) {
        return SensorDataEntitiy.builder()
                .plant(plant)
                .temperature(this.temperature)
                .humidity(this.humidity)
                .soilMoisture(this.soilMoisture)
                .measuredTime(measuredTime != null ? LocalDateTime.parse(this.measuredTime) : null)
                .build();
    }
}
