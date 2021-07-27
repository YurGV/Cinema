package com.cinema.services;

import com.cinema.dao.SeanceDao;
import com.cinema.dto.modelDto.FilmDto;
import com.cinema.dto.modelDto.SeanceDto;
import com.cinema.dto.modelMappingDto.SeanceMapper;
import com.cinema.service.SeanceService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@RequiredArgsConstructor
@Service
public class SeanceServiceImpl implements SeanceService {

    private final SeanceDao seanceDao;
    private final SeanceMapper seanceMapper;

    @Override
    public List<SeanceDto> getAllSeances() {
        return seanceDao.getAll().stream()
                .map(seanceMapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public SeanceDto getSeance(Long id) {
        return seanceMapper.toDto(seanceDao.getById(id));
    }
}

