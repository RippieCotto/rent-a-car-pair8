package com.tobeto.pair8.services.dtos.car.responses;

import com.tobeto.pair8.services.dtos.brand.responses.GetListBrandResponse;
import com.tobeto.pair8.services.dtos.color.resposes.GetListColorResponse;
import com.tobeto.pair8.services.dtos.model.responses.GetListModelRespose;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetListCarResponse {
    private int kilometer;
    private String Plate;
    private int year;
    private double dailyPrice;
    private GetListModelRespose getListModelRespose;
    private GetListColorResponse getListColorResponse;
}
