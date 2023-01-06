package com.example.carowners.dto;

import java.util.List;

public class CarOwner {

    public String name;

    public String surname;

    public List<String> carsList;

    public CarOwner(String name, String surname, List<String> carsList) {
        this.name = name;
        this.surname = surname;
        this.carsList = carsList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public List<String> getCarsList() {
        return carsList;
    }

    public void setCarsList(List<String> carsList) {
        this.carsList = carsList;
    }

    @Override
    public String toString() {
        return "CarOwner{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", carsList=" + carsList +
                '}';
    }
}
