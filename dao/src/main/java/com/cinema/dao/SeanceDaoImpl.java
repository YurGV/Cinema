package com.cinema.dao;

import com.cinema.model.Seance;
import org.springframework.stereotype.Repository;

@Repository
public class SeanceDaoImpl extends AbstractDao<Seance> implements SeanceDao {

    @Override
    public Class<Seance> getEntityClass() {
        return Seance.class;
    }

    @Override
    public Seance getById(Long id) {
        return getEntityManager().find((getEntityClass()), id);
    }


}
