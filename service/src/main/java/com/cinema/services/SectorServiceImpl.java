package com.cinema.services;

import com.cinema.dao.SectorDao;
import com.cinema.service.SectorService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@RequiredArgsConstructor
@Service
public class SectorServiceImpl implements SectorService {

    @Autowired
    private final SectorDao sectorDao;


}
