package com.tobeto.pair8.services.dtos.car.responses;

import com.tobeto.pair8.services.dtos.color.resposes.GetListColorResponse;
import com.tobeto.pair8.services.dtos.model.responses.GetListModelRespose;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetByIdCarResponse {
    private int kilometer;
    private String plate;
    private double dailyPrice;

    private GetListModelRespose model;
    private GetListColorResponse color;
}