package com.cinema.dao;

import com.cinema.model.Sector;
import org.springframework.stereotype.Repository;


@Repository
public class SectorDaoImpl extends AbstractDao<Sector> implements SectorDao {

    @Override
    public Class<Sector> getEntityClass() {
        return Sector.class;
    }

    @Override
    public Sector getById(Long id) {

        return getEntityManager().find(getEntityClass(), id);
    }

}
