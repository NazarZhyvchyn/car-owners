package com.example.carowners.service;

import com.example.carowners.dto.CarOwner;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarOwnerService {

    public String getCarOwnersInfo() {
        return CarOwnerStorage.carOwnersList.toString();
    }
}
