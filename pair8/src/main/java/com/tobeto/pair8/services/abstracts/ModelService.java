package com.tobeto.pair8.services.abstracts;

import com.tobeto.pair8.entities.Model;
import com.tobeto.pair8.services.dtos.model.requests.AddModelRequest;
import com.tobeto.pair8.services.dtos.model.requests.DeleteModelRequest;
import com.tobeto.pair8.services.dtos.model.requests.UpdateModelRequest;

public interface ModelService {
    void add(AddModelRequest addModelRequest);
    void update(UpdateModelRequest updateModelRequest);
    void delete(DeleteModelRequest deleteModelRequest);


}
