package com.internship.demo.controller;
import com.internship.demo.dto.BMIRequest;
import com.internship.demo.dto.BMIResponse;
import com.internship.demo.service.BMIService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequestMapping("/api/bmi")
public class BMIController {
    private final BMIService service;
    public BMIController(BMIService service) {
        this.service = service;
    }
    @PostMapping("/calculate")
    public ResponseEntity<BMIResponse> calculate(@Valid @RequestBody BMIRequest bmiRequest) {
        BMIResponse bmiResponse = service.calculate(bmiRequest.getGender(), bmiRequest.getAge(), bmiRequest.getMass(), bmiRequest.getExercise(), bmiRequest.getHeight(), bmiRequest.getTarget_weight(), bmiRequest.getTime(), bmiRequest.getUnit());
        if(bmiResponse.getError()!=null) {
            return ResponseEntity.badRequest().body(bmiResponse);
        }
        return ResponseEntity.ok(bmiResponse);

    }
}