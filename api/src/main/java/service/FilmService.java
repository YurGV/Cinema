package service;

import model.Film;
import model.enums.Country;
import model.enums.Format;
import model.enums.Genre;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface FilmService {


    Film fndByName(String name);
    List<Film> getAll();
    Film editFilmInfo(Long id, String name, Integer age, Date year, Integer durability, Country country, Format format, Genre genre);
}
