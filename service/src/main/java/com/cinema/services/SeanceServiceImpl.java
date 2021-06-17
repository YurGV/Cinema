package com.cinema.services;

import com.cinema.dao.SeanceDao;
import com.cinema.model.Seance;
import com.cinema.service.SeanceService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@RequiredArgsConstructor
@Service
public class SeanceServiceImpl implements SeanceService {

    @Autowired
    private final SeanceDao seanceDao;


    @Override
    public List<Seance> getAllSeances() {
        return seanceDao.getAll();
    }

    @Override
    public Seance getSeanceInfo(Long id) {
        return seanceDao.getById(id);
    }
}
