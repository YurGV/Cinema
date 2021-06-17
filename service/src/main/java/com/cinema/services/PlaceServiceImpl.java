package com.cinema.services;

import com.cinema.dao.PlaceDao;
import com.cinema.model.Place;
import com.cinema.model.Sector;
import com.cinema.model.enums.Status;
import com.cinema.service.PlaceService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@RequiredArgsConstructor
@Service
public class PlaceServiceImpl implements PlaceService {

    @Autowired
    private final PlaceDao placeDao;

    @Override
    @Transactional
    public Place editStatus(Long id, Status status) {

        Place editStatusPlace = placeDao.getById(id);
        editStatusPlace.setStatus(status);
        placeDao.save(editStatusPlace);
        return editStatusPlace;
    }

    @Override
    @Transactional
    public Place editPlaceInfo(Long id, Integer number, Integer row, Sector sector) {

        Place editPlaceInfo = placeDao.getById(id);
        editPlaceInfo.setNumber(number);
        editPlaceInfo.setRow(row);
        editPlaceInfo.setSector(sector);
        placeDao.save(editPlaceInfo);
        return editPlaceInfo;
    }

}
