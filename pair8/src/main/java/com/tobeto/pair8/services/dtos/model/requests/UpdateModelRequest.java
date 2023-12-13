package com.tobeto.pair8.services.dtos.model.requests;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class UpdateModelRequest {
   @NotNull(message = "model id null olamaz")
    private int id;
   @NotBlank(message = "isim boş olamaz")
    private String name;
   @NotNull(message = "brand id null olamaz")
    private int brandId;
}
