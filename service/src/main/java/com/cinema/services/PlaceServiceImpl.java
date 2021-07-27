package com.cinema.services;

import com.cinema.dao.PlaceDao;
import com.cinema.dto.modelDto.PlaceDto;
import com.cinema.dto.modelMappingDto.PlaceMapper;
import com.cinema.model.Place;
import com.cinema.model.Sector;
import com.cinema.model.enums.Status;
import com.cinema.service.PlaceService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@RequiredArgsConstructor
@Service
public class PlaceServiceImpl implements PlaceService {

    private final PlaceDao placeDao;
    private final PlaceMapper placeMapper;

    @Override
    @Transactional
    public PlaceDto updatePlace(PlaceDto editPlace) {
        placeDao.save(placeMapper.toEntity(editPlace));
        return editPlace;
    }

}
