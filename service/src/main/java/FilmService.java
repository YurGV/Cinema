import dao.FilmDao;
import model.Film;
import model.enums.Country;
import model.enums.Format;
import model.enums.Genre;
import service.FilmServiceImpl;

import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;



public class FilmService implements FilmServiceImpl {

    private final FilmDao filmDao;

    public FilmService(FilmDao filmDao) {
        this.filmDao = filmDao;
    }

    @Override
    public Optional<Film> getByName(String name) {

        List<Film> filmList = filmDao.getAll();

        return filmList.stream()
                .filter(x -> x.getName().equals(name))
                .findFirst();
    }

    @Override
    public List<Film> sortByDate() {

        List<Film> filmList = filmDao.getAll();

        return filmList.stream()
                .sorted(Comparator.comparing(Film::getYear))
                .collect(Collectors.toList());
    }

    @Override
    public List<Film> sortByGenre() {
        List<Film> filmList = filmDao.getAll();

        return filmList.stream()
                .sorted(Comparator.comparing(Film::getGenre))
                .collect(Collectors.toList());
    }

    @Override
    public List<Film> sortByFormat() {
        List<Film> filmList = filmDao.getAll();

        return filmList.stream()
                .sorted(Comparator.comparing(Film::getFormat))
                .collect(Collectors.toList());
    }

    @Override
    public List<Film> sortByAge() {
        List<Film> filmList = filmDao.getAll();

        return filmList.stream()
                .sorted(Comparator.comparing(Film::getAge))
                .collect(Collectors.toList());
    }

    @Override
    public List<Film> sortByCountry() {
        List<Film> filmList = filmDao.getAll();

        return filmList.stream()
                .sorted(Comparator.comparing(Film::getCounty))
                .collect(Collectors.toList());
    }


    @Override
    public Film editFilmInfo(Long id, String name, Integer age, Date year, Integer durability, Country country, Format format, Genre genre) {

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
