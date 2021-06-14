import dao.HallDao;
import lombok.RequiredArgsConstructor;
import model.Cinema;
import model.Hall;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.HallServiceImpl;

import javax.transaction.Transactional;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Transactional
@RequiredArgsConstructor
@Service
public class HallService implements HallServiceImpl {

    @Autowired
    private final HallDao hallDao;

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
