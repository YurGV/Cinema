package service;

import model.Place;
import model.Sector;
import model.enums.Status;



public interface PlaceServiceImpl {

    Place editStatus(Long id, Status status);
    Place editPlaceInfo(Long id, Integer number, Integer row, Sector sector);


}
