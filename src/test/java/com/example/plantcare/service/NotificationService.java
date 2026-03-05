package com.example.plantcare.service;

import com.example.plantcare.repository.NotificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {
    @Autowired private NotificationRepository notificationRepository;
}
