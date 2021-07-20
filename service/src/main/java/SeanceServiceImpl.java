
import dao.SeanceDao;
import lombok.RequiredArgsConstructor;
import model.Seance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import javax.transaction.Transactional;
import java.util.List;

@Transactional
@RequiredArgsConstructor
@Service
public class SeanceServiceImpl implements service.SeanceService {

    @Autowired
    private final SeanceDao seanceDao;

    @Override
    public List<Seance> getAllSeance() {
        return seanceDao.getAll();
    }

    @Override
    public Seance getSeanceInfo(Long id) {
        return seanceDao.getById(id);
    }
}
