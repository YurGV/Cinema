package com.cinema.dto.mappingDto;

import com.cinema.dto.modelDto.HallDto;
import com.cinema.model.Hall;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HallMapper extends AbstractMapper<Hall, HallDto>{

    @Autowired
    public HallMapper() {
        super(Hall.class, HallDto.class);
    }
}
