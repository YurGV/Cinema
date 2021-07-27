package com.cinema.dao;

import com.cinema.model.Place;
import org.springframework.stereotype.Repository;

@Repository
public class PlaceDaoImpl extends AbstractDao<Place> implements PlaceDao {

    @Override
    public Class<Place> getEntityClass() {
        return Place.class;
    }

    @Override
    public Place getById(Long id) {
        return getEntityManager().find((getEntityClass()), id);
    }


}
