package com.tobeto.pair8.services.concretes;

import com.tobeto.pair8.entities.Brand;
import com.tobeto.pair8.entities.Model;
import com.tobeto.pair8.repositories.ModelRepository;
import com.tobeto.pair8.services.abstracts.BrandService;
import com.tobeto.pair8.services.abstracts.ModelService;
import com.tobeto.pair8.services.dtos.model.requests.AddModelRequest;
import com.tobeto.pair8.services.dtos.model.requests.DeleteModelRequest;
import com.tobeto.pair8.services.dtos.model.requests.UpdateModelRequest;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;

@Data
@AllArgsConstructor
@Service
public class ModelManager implements ModelService {
    private ModelRepository modelRepository;
    private final BrandService brandService;

    @Override
    public void add(AddModelRequest addModelRequest) {
        Model model = new Model();
        model.setName(addModelRequest.getName());
        Brand brand = brandService.getById(addModelRequest.getBrandId());
        model.setBrand(brand);
        modelRepository.save(model);
    }

    @Override
    public void update(UpdateModelRequest updateModelRequest) {

    }

    @Override
    public void delete(DeleteModelRequest deleteModelRequest) {

    }

    @Override
    public Model getById(int modelId) {
        return modelRepository.findById(modelId).orElseThrow();
    }
}
