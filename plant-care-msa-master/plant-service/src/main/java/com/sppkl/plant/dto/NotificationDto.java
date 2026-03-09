package com.example.plantcare.dto;

import com.example.plantcare.entity.MyPlantEntitiy;
import com.example.plantcare.entity.NotificationEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data@AllArgsConstructor@NoArgsConstructor@Builder
public class NotificationDto {
    private Long notificationId;
    private Integer plantId;
    private String type;
    private String message;
    private Boolean isSent;
    private String createDate;
    private String updateDate;

    public NotificationEntity toEntity(MyPlantEntitiy plant) {
        return NotificationEntity.builder()
                .plant(plant)
                .type(this.type)
                .message(this.message)
                .isSent(this.isSent != null ? this.isSent : false)
                .build();
    }
}
