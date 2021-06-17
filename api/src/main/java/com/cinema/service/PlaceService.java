package com.cinema.service;

import com.cinema.model.Place;
import com.cinema.model.Sector;
import com.cinema.model.enums.Status;

public interface PlaceService {

    Place editStatus(Long id, Status status);
    Place editPlaceInfo(Long id, Integer number, Integer row, Sector sector);


}
