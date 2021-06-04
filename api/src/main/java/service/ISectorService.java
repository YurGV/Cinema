package service;

import model.Sector;

import java.util.List;

public interface ISectorService {

    List<Sector> sortByPrice();
    List<Sector> sortByName();
    List<Sector> sortByFreePlace();

}
