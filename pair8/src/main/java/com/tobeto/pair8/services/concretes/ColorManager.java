package com.tobeto.pair8.services.concretes;

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
    private ColorRepository colorRepository;
    @Override
    public void add(AddColorRequest addColorRequest) {
        Color color = new Color();
        color.setName(addColorRequest.getName());
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
