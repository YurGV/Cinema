import dao.CinemaDao;

import lombok.RequiredArgsConstructor;
import model.Cinema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import service.CinemaServiceImpl;

@Transactional
@RequiredArgsConstructor
@Service
public class CinemaService implements CinemaServiceImpl {

    @Autowired
    private final CinemaDao cinemaDao;

    @Override
    public Cinema getCinemaInfo(Long id) {
        return cinemaDao.getById(id);
    }

}
