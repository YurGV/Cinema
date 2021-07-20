package com.cinema.dto.mappingDto;

import com.cinema.dto.modelDto.PlaceDto;
import com.cinema.model.Place;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PlaceMapper extends AbstractMapper<Place,PlaceDto>{

    @Autowired
    public PlaceMapper() {
        super(Place.class, PlaceDto.class);
    }
}
