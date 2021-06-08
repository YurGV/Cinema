import model.Cinema;



public class CinemaDaoImpl extends AbstractDao<Cinema> implements dao.CinemaDao {


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
        updCinema.setFilmList(entity.getFilmList());
        updCinema.setSeanceList(entity.getSeanceList());
        updCinema.setHallList(entity.getHallList());
        return updCinema;
    }

}
