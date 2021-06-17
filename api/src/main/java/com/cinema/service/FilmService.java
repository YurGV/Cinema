package com.cinema.service;

import com.cinema.model.Film;
import com.cinema.model.enums.Country;
import com.cinema.model.enums.Format;
import com.cinema.model.enums.Genre;

import java.util.Date;
import java.util.List;

public interface FilmService {


    Film findByName(String name);
    List<Film> getAll();
    Film updateFilmInfo(Long id, String name, Integer age, Date year, Integer durability, Country country, Format format, Genre genre);
}
