package com.cinema.dto.modelMappingDto;

import com.cinema.dto.modelDto.CinemaDto;
import com.cinema.model.Cinema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CinemaMapper extends AbstractMapper<Cinema, CinemaDto>{

    @Autowired
    public CinemaMapper() {
        super(Cinema.class, CinemaDto.class);
    }
}
