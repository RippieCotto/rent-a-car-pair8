package com.tobeto.pair8.services.concretes;

import com.tobeto.pair8.entities.Car;
import com.tobeto.pair8.entities.Color;
import com.tobeto.pair8.entities.Model;
import com.tobeto.pair8.repositories.CarRepository;
import com.tobeto.pair8.services.abstracts.CarService;
import com.tobeto.pair8.services.abstracts.ColorService;
import com.tobeto.pair8.services.abstracts.ModelService;
import com.tobeto.pair8.services.dtos.car.requests.AddCarRequest;
import com.tobeto.pair8.services.dtos.car.requests.DeleteCarRequest;
import com.tobeto.pair8.services.dtos.car.requests.UpdateCarRequest;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CarManager implements CarService {
private final CarRepository carRepository;
private final ModelService modelService;
private final ColorService colorService;

    @Override
    public void add(AddCarRequest addCarRequest) {
        Car car = new Car();
        car.setKilometer(addCarRequest.getKilometer());
        car.setPlate(addCarRequest.getPlate().replaceAll("\\s+", ""));
        car.setYear(addCarRequest.getYear());
        car.setDailyPrice(addCarRequest.getDailyPrice());
        Model model = modelService.getById(addCarRequest.getModelId());
        car.setModel(model);
        Color color = colorService.getById(addCarRequest.getColorId());
        carRepository.save(car);

    }

    @Override
    public void delete(DeleteCarRequest deleteCarRequest) {

    }

    @Override
    public void update(UpdateCarRequest updateCarRequest) {

    }
}
