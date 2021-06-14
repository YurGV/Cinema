import dao.SectorDao;
import lombok.RequiredArgsConstructor;
import model.Sector;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.SectorServiceImpl;

import javax.transaction.Transactional;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Transactional
@RequiredArgsConstructor
@Service
public class SectorService implements SectorServiceImpl {

    @Autowired
    private final SectorDao sectorDao;


}
