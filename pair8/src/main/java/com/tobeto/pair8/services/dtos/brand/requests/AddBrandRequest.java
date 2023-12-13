package com.tobeto.pair8.services.dtos.brand.requests;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class AddBrandRequest {
    @NotBlank
    private String name;
}
