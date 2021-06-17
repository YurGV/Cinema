package com.cinema.dao;

import com.cinema.model.Film;
import org.springframework.stereotype.Repository;

@Repository
public class FilmDaoImpl extends AbstractDao<Film> implements FilmDao {

    @Override
    public Class<Film> getEntityClass() {
        return Film.class;
    }

    @Override
    public Film getById(Long id) {
        return getEntityManager().find((getEntityClass()), id);
    }


}
