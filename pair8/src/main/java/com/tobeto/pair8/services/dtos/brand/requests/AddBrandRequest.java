package com.tobeto.pair8.services.dtos.brand.requests;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class AddBrandRequest {
    @NotBlank(message = "Marka alanı boş olamaz!!!")
    private String name;
}
