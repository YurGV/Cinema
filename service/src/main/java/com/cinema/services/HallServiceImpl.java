package com.cinema.services;

import com.cinema.dao.HallDao;
import com.cinema.model.Cinema;
import com.cinema.model.Hall;
import com.cinema.service.HallService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@RequiredArgsConstructor
@Service
public class HallServiceImpl implements HallService {

    @Autowired
    private final HallDao hallDao;

    @Override
    @Transactional
    public Hall editHall(Long id, String name, Integer capacity, Cinema cinema) {

        Hall editHall = hallDao.getById(id);

        editHall.setName(name);
        editHall.setCapacity(capacity);
        editHall.setCinema(cinema);

        hallDao.save(editHall);

        return editHall;
    }

}
