package com.cinema.dao;

import com.cinema.model.Hall;
import org.springframework.stereotype.Repository;

@Repository
public class HallDaoImpl extends AbstractDao<Hall> implements HallDao {

    @Override
    public Class<Hall> getEntityClass() {
        return null;
    }

    @Override
    public Hall getById(Long id) {
        return getEntityManager().find((getEntityClass()), id);
    }
}
