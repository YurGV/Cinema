package com.cinema.service;

import com.cinema.dto.modelDto.SeanceDto;
import com.cinema.model.Seance;

import java.util.List;

public interface SeanceService {

    List<SeanceDto> getAllSeances();
    SeanceDto getSeance(Long id);
}
