package com.tobeto.pair8.services.dtos.color.requests;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class UpdateColorRequest {
    @NotNull(message = "color id bulunamadı.")
    private int id;
    @NotBlank(message = "color name bulunamadı.")
    private String name;
}
