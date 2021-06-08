package service;

import model.Place;
import model.Sector;
import model.enums.Status;


import java.util.List;

public interface PlaceServiceImpl {

    Place editStatus(Long id, Status status);
    Place editPlaceInfo(Long id, Integer number, Integer row, Sector sector);
    List<Place> sortByStatus();

}
