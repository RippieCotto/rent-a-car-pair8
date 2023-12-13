package com.tobeto.pair8.services.dtos.car.requests;

import lombok.Data;

@Data
public class UpdateCarRequest {
    private  int id;
    private int kilometer;
    private String plate;
    private int year;
    private double dailyPrice;

}
