package com.cinema.service;

import com.cinema.model.Seance;

import java.util.List;

public interface SeanceService {

    List<Seance> getAllSeances();
    Seance getSeanceInfo(Long id);
}
