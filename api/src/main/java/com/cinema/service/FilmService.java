package com.cinema.service;

import com.cinema.dto.modelDto.FilmDto;


import java.util.List;

public interface FilmService {


    FilmDto findByName(String name);
    List<FilmDto> getAll();
    FilmDto updateFilmInfo(FilmDto editFilm);
}
