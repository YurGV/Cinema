package com.cinema.dao;

import com.cinema.model.Client;
import org.springframework.stereotype.Repository;

@Repository
public class ClientDaoImpl extends AbstractDao<Client> implements ClientDao {

    @Override
    public Class<Client> getEntityClass() {
        return Client.class;
    }

    @Override
    public Client getById(Long id) {
        return getEntityManager().find(getEntityClass(), id);
    }

}
