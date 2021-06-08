import dao.PlaceDao;
import model.Place;
import model.Sector;
import model.enums.Status;
import service.PlaceServiceImpl;

import java.util.List;


public class PlaceService implements PlaceServiceImpl {

    private final PlaceDao placeDao;

    public PlaceService(PlaceDao placeDao) {
        this.placeDao = placeDao;
    }

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
