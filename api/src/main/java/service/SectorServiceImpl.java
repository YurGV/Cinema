package service;

import model.Sector;


import java.util.List;

public interface SectorServiceImpl {

    List<Sector> sortByPrice();
    List<Sector> sortByName();


}
