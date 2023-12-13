package com.tobeto.pair8.services.dtos.brand.requests;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class UpdateBrandRequest {
    @NotNull
    private int id;
    @NotBlank
    private String name;
}
