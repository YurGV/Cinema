package com.cinema.dto.modelMappingDto;

import com.cinema.dto.modelDto.SeanceDto;
import com.cinema.model.Seance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SeanceMapper extends AbstractMapper<Seance, SeanceDto>{


    public SeanceMapper() {
        super(Seance.class, SeanceDto.class);
    }
}
