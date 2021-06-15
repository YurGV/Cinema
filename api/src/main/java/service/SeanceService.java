package service;

import model.Seance;

import java.util.List;

public interface SeanceService {

    List<Seance> getAllSeances();
    Seance getSeanceInfo(Long id);
}
