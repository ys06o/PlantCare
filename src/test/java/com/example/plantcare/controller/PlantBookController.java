package com.example.plantcare.controller;

import com.example.plantcare.service.PlantBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlantBookController {
    @Autowired private PlantBookService plantBookService;
}
