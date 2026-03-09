package com.sppkl.ai.controller;

import com.sppkl.ai.service.GeminiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;
import java.util.Base64;

@RestController
public class GeminiController {

    @Autowired
    private GeminiService geminiService;

    @PostMapping("/diagnosis/ai")
    public String diagnosePlant(@RequestParam("image") MultipartFile image) throws IOException {
        byte[] imageBytes = image.getBytes();
        String base64Image = Base64.getEncoder().encodeToString(imageBytes);
        return geminiService.diagnose(base64Image);
    }
}