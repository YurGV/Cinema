package service;

import model.Film;

import java.sql.Time;
import java.util.Date;
import java.util.List;

public interface IFilmService {

    Film getByName(String name);
    List<Film> sortByDate();
    List<Film> sortByGenre();
    List<Film> sortByFormat();
    List<Film> sortByAge();
    List<Film> sortByCountry();
    Film editFilmInfo(String name, Integer age, Date year, Time durability, String country, String format, String genre);
}
