import dao.FilmDao;
import model.Film;
import org.springframework.stereotype.Repository;

@Repository
public class FilmDaoImpl extends AbstractDao<Film> implements FilmDao {


    @Override
    public Film getById(Long id) {

        return repository.stream()
                .filter(x->x.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @Override
    public Film update(Film entity){

        Film updFilm = getById(entity.getId());

        updFilm.setName(entity.getName());
        updFilm.setAge(entity.getAge());
        updFilm.setYear(entity.getYear());
        updFilm.setDurability(entity.getDurability());
        updFilm.setCounty(entity.getCounty());
        updFilm.setFormat(entity.getFormat());
        updFilm.setGenre(entity.getGenre());
        updFilm.setCinema(entity.getCinema());
        updFilm.setSeance(entity.getSeance());

        return updFilm;
    }
}
