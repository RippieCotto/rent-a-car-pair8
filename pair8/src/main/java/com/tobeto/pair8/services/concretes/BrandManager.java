package com.tobeto.pair8.services.concretes;

import com.tobeto.pair8.core.utilities.mappers.ModelMapperService;
import com.tobeto.pair8.entities.Brand;
import com.tobeto.pair8.repositories.BrandRepository;
import com.tobeto.pair8.repositories.ModelRepository;
import com.tobeto.pair8.services.abstracts.BrandService;
import com.tobeto.pair8.services.dtos.brand.requests.AddBrandRequest;
import com.tobeto.pair8.services.dtos.brand.requests.DeleteBrandRequest;
import com.tobeto.pair8.services.dtos.brand.requests.UpdateBrandRequest;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class BrandManager implements BrandService {
    private final BrandRepository brandRepository;
    private ModelMapperService modelMapperService;
    @Override
    public void add(AddBrandRequest addBrandRequest) {
        Brand brand = this.modelMapperService.forRequest().map(addBrandRequest, Brand.class);
        brandRepository.save(brand);
    }

    @Override
    public void update(UpdateBrandRequest updateBrandRequest) {
    }

    @Override
    public void delete(DeleteBrandRequest deleteBrandRequest) {

    }

    @Override
    public Brand getById(int brandId) {
        return brandRepository.findById(brandId).orElseThrow();
    }
}
