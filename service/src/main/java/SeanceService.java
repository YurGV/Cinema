
import dao.SeanceDao;
import model.Seance;
import service.SeanceServiceImpl;


import java.util.List;

public class SeanceService implements SeanceServiceImpl {

    private final SeanceDao seanceDao;

    public SeanceService(SeanceDao seanceDao) {
        this.seanceDao = seanceDao;
    }


    @Override
    public List<Seance> getAllSeance() {
        return seanceDao.getAll();
    }

    @Override
    public Seance getSeanceInfo(Long id) {
        return seanceDao.getById(id);
    }
}
