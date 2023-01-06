package com.example.carowners.service;

import com.example.carowners.dto.CarOwner;

import java.util.List;

public class CarOwnerStorage {

     static List<CarOwner> carOwnersList = List.of(
            new CarOwner("John", "Doe", List.of("Toyota", "Volvo")),
            new CarOwner("Michael", "Smith", List.of("BMW")),
            new CarOwner("Donald", "Brown", List.of("Mercedes-Benz")),
            new CarOwner("John", "Williams", List.of("Audi")),
            new CarOwner("George", "Johnson", List.of("Renault")));
}
