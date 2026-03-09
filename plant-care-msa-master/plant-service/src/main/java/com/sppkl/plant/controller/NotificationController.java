package com.example.plantcare.controller;

import com.example.plantcare.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotificationController {
    @Autowired private NotificationService notificationService;
}
