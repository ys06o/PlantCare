package com.example.plantcare.entity;

import com.example.plantcare.dto.NotificationDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Notification")
@Data @AllArgsConstructor@NoArgsConstructor
@Builder
public class NotificationEntity extends BaseTime{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "notification_id")
    private Long notificationId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "plant_id", nullable = false)
    private MyPlantEntitiy plant;

    @Column(name = "type", nullable = false, length = 50)
    private String type;

    @Column(name = "message", length = 255)
    private String message;

    @Column(name = "is_sent", nullable = false)
    private Boolean isSent = false;

    public NotificationDto toDto() {
        return NotificationDto.builder()
                .notificationId(notificationId)
                .plantId(plant.getPlantId())
                .type(type)
                .message(message)
                .isSent(isSent)
                .createDate(getCreateDate() != null ? getCreateDate().toString() : null)
                .updateDate(getUpdateDate() != null ? getUpdateDate().toString() : null)
                .build();
    }
}
