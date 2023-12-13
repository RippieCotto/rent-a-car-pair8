package com.tobeto.pair8.services.dtos.car.responses;

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

  //  Plaka,Kilometre,Ücret,Yıl, Model Adı, Renk Adı

}
