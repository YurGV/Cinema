package service;

import model.Cinema;

//Impl -- это имплементация, а инетерфейс без постфикса надо обзывать
public interface CinemaService {

    Cinema getCinemaInfo(Long id);
}
