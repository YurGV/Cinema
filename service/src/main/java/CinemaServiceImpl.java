import dao.CinemaDao;

import lombok.RequiredArgsConstructor;
import model.Cinema;
import service.CinemaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@RequiredArgsConstructor
@Service
public class CinemaServiceImpl implements CinemaService {

    @Autowired
    private final CinemaDao cinemaDao;

    @Override
    public Cinema getCinemaInfo(Long id) {
        return cinemaDao.getById(id);
    }

}
