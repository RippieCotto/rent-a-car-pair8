package com.tobeto.pair8.controllers;

import com.tobeto.pair8.services.abstracts.CarService;
import com.tobeto.pair8.services.dtos.car.requests.AddCarRequest;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/cars")
@AllArgsConstructor

public class CarsController {
private CarService carService;

@PostMapping
    public void add(@RequestBody @Valid AddCarRequest addCarRequest) {

    carService.add(addCarRequest);
}


}
