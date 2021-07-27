package com.cinema.services;

import com.cinema.dao.CinemaDao;
import com.cinema.dto.modelDto.CinemaDto;
import com.cinema.dto.modelMappingDto.CinemaMapper;
import com.cinema.service.CinemaService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class CinemaServiceImpl implements CinemaService {

    private final CinemaDao cinemaDao;
    private final CinemaMapper cinemaMapper;

    @Override
    public CinemaDto getCinema(Long id) {
       return cinemaMapper.toDto(cinemaDao.getById(id));
    }

}
