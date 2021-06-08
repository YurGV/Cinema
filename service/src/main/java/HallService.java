import dao.HallDao;
import model.Cinema;
import model.Hall;
import service.HallServiceImpl;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class HallService implements HallServiceImpl {

    private final HallDao hallDao;

    public HallService(HallDao hallDao) {
        this.hallDao = hallDao;
    }


    @Override
    public Hall editHall(Long id, String name, Integer capacity, Cinema cinema) {

        Hall editHall = hallDao.getById(id);

        editHall.setName(name);
        editHall.setCapacity(capacity);
        editHall.setCinema(cinema);

        hallDao.save(editHall);

        return editHall;
    }

}
