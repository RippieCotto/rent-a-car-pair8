package com.tobeto.pair8.services.concretes;

import com.tobeto.pair8.core.utilities.mappers.ModelMapperService;
import com.tobeto.pair8.entities.Color;
import com.tobeto.pair8.repositories.ColorRepository;
import com.tobeto.pair8.services.abstracts.ColorService;
import com.tobeto.pair8.services.dtos.color.requests.AddColorRequest;
import com.tobeto.pair8.services.dtos.color.requests.DeleteColorRequest;
import com.tobeto.pair8.services.dtos.color.requests.UpdateColorRequest;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ColorManager implements ColorService {
    private final ColorRepository colorRepository;
    private final ModelMapperService modelMapperService;
    @Override
    public void add(AddColorRequest addColorRequest) {
        Color color = this.modelMapperService.forRequest().map(addColorRequest, Color.class);
        colorRepository.save(color);
    }
    @Override
    public void update(UpdateColorRequest updateColorRequest) {
     Color colorToUpate =colorRepository.findById(updateColorRequest.getId()).orElseThrow();

     this.modelMapperService.forRequest().map(updateColorRequest,colorToUpate);
     colorRepository.saveAndFlush(colorToUpate);

    }

    @Override
    public void delete(DeleteColorRequest deleteColorRequest) {
        Color colorToDelete = colorRepository.findById(deleteColorRequest.getId()).orElseThrow();
        colorRepository.delete(colorToDelete);


    }


}
