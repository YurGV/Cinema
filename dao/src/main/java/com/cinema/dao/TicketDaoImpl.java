package com.cinema.dao;

import com.cinema.model.Ticket;
import org.springframework.stereotype.Repository;


@Repository
public class TicketDaoImpl extends AbstractDao<Ticket> implements TicketDao {

    @Override
    public Class<Ticket> getEntityClass() {
        return Ticket.class;
    }

    @Override
    public Ticket getById(Long id) {

        return getEntityManager().find(getEntityClass(), id);
    }

}
