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

    @Override
    public List<Sector> sortByPrice() {

        List<Sector> sectorList = sectorDao.getAll();
        return sectorList.stream()
                .sorted(Comparator.comparing(Sector::getPrice))
                .collect(Collectors.toList());
    }

    @Override
    public List<Sector> sortByName() {
        List<Sector> sectorList = sectorDao.getAll();
        return sectorList.stream()
                .sorted(Comparator.comparing(Sector::getName))
                .collect(Collectors.toList());
    }

}
