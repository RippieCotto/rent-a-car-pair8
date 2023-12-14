package com.tobeto.pair8.services.dtos.model.requests;

import com.tobeto.pair8.services.dtos.brand.responses.GetAllListBrandResponse;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class AddModelRequest {
    @NotBlank(message = "model ismi boş olamaz")
    private String name;

    private GetAllListBrandResponse brandResponse;
}
