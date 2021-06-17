package com.cinema.service;

import com.cinema.model.Cinema;
import com.cinema.model.Hall;

public interface HallService {

    Hall editHall(Long id, String name, Integer capacity, Cinema cinema);


}
