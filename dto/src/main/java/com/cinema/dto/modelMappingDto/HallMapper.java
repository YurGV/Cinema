package com.cinema.dto.modelMappingDto;

import com.cinema.dto.modelDto.HallDto;
import com.cinema.model.Hall;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HallMapper extends AbstractMapper<Hall, HallDto>{


    public HallMapper() {
        super(Hall.class, HallDto.class);
    }
}
