package service;

import model.Cinema;
import model.Hall;

import java.util.List;

public interface IHallService {

    Hall editHall(String name, Integer capacity, Cinema cinema);
    List<Hall> sortByCapacity();
    List<Hall> sortByName();
}