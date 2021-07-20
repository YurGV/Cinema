package com.cinema.dto.modelMappingDto;

import com.cinema.dto.modelDto.SectorDto;
import com.cinema.model.Sector;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SectorMapper extends AbstractMapper<Sector, SectorDto>{

    @Autowired
    public SectorMapper() {
        super(Sector.class, SectorDto.class);
    }
}
