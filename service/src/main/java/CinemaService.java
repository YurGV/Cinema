import dao.CinemaDao;
import model.Cinema;
import service.CinemaServiceImpl;

public class CinemaService implements CinemaServiceImpl {

    private final CinemaDao cinemaDao;

    public CinemaService(CinemaDao cinemaDao) {
        this.cinemaDao = cinemaDao;
    }

    @Override
    public Cinema getCinemaInfo(Long id) {
        return cinemaDao.getById(id);
    }

}
