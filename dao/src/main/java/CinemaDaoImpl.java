
import dao.CinemaDao;
import model.Cinema;



public class CinemaDaoImpl extends AbstractDao<Cinema> implements CinemaDao {


    @Override
    public Cinema getById(Long id) {

        return repository.stream()
                .filter(x->x.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @Override
    public Cinema update(Cinema entity) {

        Cinema updCinema = getById(entity.getId());

        updCinema.setId(entity.getId());
        updCinema.setName(entity.getName());
        updCinema.setEmail(entity.getEmail());
        updCinema.setAddress(entity.getAddress());
        updCinema.setNumberOfCinemaHall(entity.getNumberOfCinemaHall());
        updCinema.setFilms(entity.getFilms());
        updCinema.setSeances(entity.getSeances());
        updCinema.setHalls(entity.getHalls());
        return updCinema;
    }

}
