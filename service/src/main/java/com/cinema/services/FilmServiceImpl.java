package com.cinema.services;

import com.cinema.exception.ExceptionHandler.UserNotFoundException;
import com.cinema.dao.FilmDao;
import com.cinema.model.enums.Country;
import com.cinema.model.enums.Format;
import com.cinema.model.enums.Genre;
import com.cinema.service.FilmService;
import lombok.RequiredArgsConstructor;
import com.cinema.model.Film;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;


@RequiredArgsConstructor
@Service
public class FilmServiceImpl implements FilmService {

    @Autowired
    private final FilmDao filmDao;

    @Override
    public Film findByName(String name) {

        return filmDao.getAll().stream()
                .filter(x -> x.getName().equals(name))
                .findFirst()
                .orElseThrow(UserNotFoundException::new);
    }

    @Override
    public List<Film> getAll() {
        return filmDao.getAll();
    }


    @Override
    @Transactional
    public Film updateFilmInfo(Long id, String name, Integer age, Date year, Integer durability, Country country, Format format, Genre genre) {

        Film editFilm = filmDao.getById(id);

        editFilm.setName(name);
        editFilm.setAge(age);
        editFilm.setYear(year);
        editFilm.setDurability(durability);
        editFilm.setCounty(country);
        editFilm.setFormat(format);
        editFilm.setGenre(genre);

        filmDao.save(editFilm);
        return editFilm;
    }
}
