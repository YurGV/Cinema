import dao.FilmDao;
import lombok.RequiredArgsConstructor;
import model.Film;
import model.enums.Country;
import model.enums.Format;
import model.enums.Genre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.FilmServiceImpl;

import javax.transaction.Transactional;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@Transactional
@RequiredArgsConstructor
@Service
public class FilmService implements FilmServiceImpl {

    @Autowired
    private final FilmDao filmDao;

    @Override
    public Optional<Film> fndByName(String name) {

        return filmDao.getAll().stream()
                .filter(x -> x.getName().equals(name))
                .findFirst();
    }

    @Override
    public List<Film> getAll() {
        return filmDao.getAll();
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
