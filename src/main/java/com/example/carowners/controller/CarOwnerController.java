package com.example.carowners.controller;

import com.example.carowners.service.CarOwnerService;
import org.springframework.web.bind.annotation.*;

@RestController
public class CarOwnerController {
    private final CarOwnerService carOwnerService;

    public CarOwnerController(CarOwnerService carOwnerService) {
        this.carOwnerService = carOwnerService;
    }

    @GetMapping("/api/carOwnerInfo")
    public String getCarOwnerInfo() {
        return carOwnerService.getCarOwnersInfo().toString();
    }
}


