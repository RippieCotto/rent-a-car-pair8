package com.tobeto.pair8.services.abstracts;

import com.tobeto.pair8.services.dtos.car.requests.AddCarRequest;
import com.tobeto.pair8.services.dtos.car.requests.DeleteCarRequest;
import com.tobeto.pair8.services.dtos.car.requests.UpdateCarRequest;

public interface CarService {

    void add(AddCarRequest addCarRequest);
    void delete(DeleteCarRequest deleteCarRequest);
    void update(UpdateCarRequest updateCarRequest);

}
