package service;

import model.Film;
import model.enums.Country;
import model.enums.Format;
import model.enums.Genre;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface FilmServiceImpl {

    Optional<Film> getByName(String name);
    List<Film> sortByDate();
    List<Film> sortByGenre();
    List<Film> sortByFormat();
    List<Film> sortByAge();
    List<Film> sortByCountry();
    Film editFilmInfo(Long id, String name, Integer age, Date year, Integer durability, Country country, Format format, Genre genre);
}
