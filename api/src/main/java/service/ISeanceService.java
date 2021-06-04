package service;

import model.Seance;

import java.util.List;

public interface ISeanceService {

    List<Seance> getAllSeance();
    Seance getSeanceInfo(Long id);
}
