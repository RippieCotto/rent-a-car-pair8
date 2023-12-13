package com.tobeto.pair8.services.dtos.color.requests;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class AddColorRequest {
    @NotBlank
    private String name;
}
