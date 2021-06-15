package service;

import model.Cinema;
import model.Hall;

import java.util.List;

public interface HallService {

    Hall editHall(Long id, String name, Integer capacity, Cinema cinema);


}
