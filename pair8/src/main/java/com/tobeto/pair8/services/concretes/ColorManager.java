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

    }

    @Override
    public void delete(DeleteColorRequest deleteColorRequest) {

    }

    @Override
    public Color getById(int colorId) {
        return colorRepository.findById(colorId).orElseThrow();
    }
}
