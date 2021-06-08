import dao.SectorDao;
import model.Sector;
import service.SectorServiceImpl;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SectorService implements SectorServiceImpl {

    private final SectorDao sectorDao;

    public SectorService(SectorDao sectorDao){
        this.sectorDao = sectorDao;
    }



}
