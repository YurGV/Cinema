package service;

import model.Seance;

import java.util.List;

public interface SeanceServiceImpl {

    List<Seance> getAllSeance();
    Seance getSeanceInfo(Long id);
}
