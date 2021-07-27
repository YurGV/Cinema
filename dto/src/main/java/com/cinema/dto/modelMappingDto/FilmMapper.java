package com.cinema.dto.modelMappingDto;

import com.cinema.dto.modelDto.FilmDto;
import com.cinema.model.Film;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FilmMapper extends AbstractMapper<Film, FilmDto>{


    public FilmMapper() {
        super(Film.class, FilmDto.class);
    }
}
