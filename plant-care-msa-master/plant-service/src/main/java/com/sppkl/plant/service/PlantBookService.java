package com.example.plantcare.service;

import com.example.plantcare.repository.PlantBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlantBookService {
    @Autowired private PlantBookRepository plantBookRepository;
}
