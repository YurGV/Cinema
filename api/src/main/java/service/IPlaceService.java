package service;

import model.Place;
import model.Sector;


import java.util.List;

public interface IPlaceService {

    Place editStatus(String status);
    Place editPlaceInfo(Integer number, Integer row, Sector sector);
    List<Place> sortByStatus();

}
