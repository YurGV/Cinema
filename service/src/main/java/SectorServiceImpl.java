import dao.SectorDao;
import lombok.RequiredArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Transactional
@RequiredArgsConstructor
@Service
public class SectorServiceImpl implements service.SectorService {

    @Autowired
    private final SectorDao sectorDao;


}
