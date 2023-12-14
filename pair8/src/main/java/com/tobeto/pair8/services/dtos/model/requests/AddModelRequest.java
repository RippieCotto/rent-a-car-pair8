package com.tobeto.pair8.services.dtos.model.requests;

import com.tobeto.pair8.services.dtos.brand.responses.GetListBrandResponse;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class AddModelRequest {
    @NotBlank(message = "model ismi boş olamaz")
    private String name;
    @NotNull(message = "brand id boş olamaz")
    private int brandId;
}
