import dao.PlaceDao;
import lombok.RequiredArgsConstructor;
import model.Place;
import model.Sector;
import model.enums.Status;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.PlaceServiceImpl;
import javax.transaction.Transactional;


@Transactional
@RequiredArgsConstructor
@Service
public class PlaceService implements PlaceServiceImpl {

    @Autowired
    private final PlaceDao placeDao;

    @Override
    public Place editStatus(Long id, Status status) {

        Place editStatusPlace = placeDao.getById(id);
        editStatusPlace.setStatus(status);
        placeDao.save(editStatusPlace);
        return editStatusPlace;
    }

    @Override
    public Place editPlaceInfo(Long id, Integer number, Integer row, Sector sector) {

        Place editPlaceInfo = placeDao.getById(id);
        editPlaceInfo.setNumber(number);
        editPlaceInfo.setRow(row);
        editPlaceInfo.setSector(sector);
        placeDao.save(editPlaceInfo);
        return editPlaceInfo;
    }

}
