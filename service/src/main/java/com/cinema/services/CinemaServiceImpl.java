package com.cinema.services;

import com.cinema.dao.CinemaDao;
import com.cinema.service.CinemaService;
import lombok.RequiredArgsConstructor;
import com.cinema.model.Cinema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@RequiredArgsConstructor
@Service
public class CinemaServiceImpl implements CinemaService {

    @Autowired
    private final CinemaDao cinemaDao;

    @Override
    public Cinema getCinemaInfo(Long id) {
        return cinemaDao.getById(id);
    }

}
