package com.cinema.services;

import com.cinema.exception.ExceptionHandler.UserNotFoundException;
import com.cinema.dao.ClientDao;
import com.cinema.service.ClientIService;
import lombok.RequiredArgsConstructor;
import com.cinema.model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@RequiredArgsConstructor
@Service
// реализация, если она не абстракт, должна имплементить все методы интерфейса
public class ClientServiceImpl implements ClientIService {

    @Autowired
    private final ClientDao clientDao;

    @Override
    @Transactional
    public Client addClient(String firstName, String lastName, String email, String password) {
        Client newClient = new Client();
        clientDao.save(newClient);
        return newClient;
    }
    @Override
    public Client getClient(Long id) {
        return clientDao.getById(id);
    }

    @Override
    public List<Client> getAllClients() {
        return clientDao.getAll();
    }

    @Override
    @Transactional
    public Client updateClient(Long id, String firstName, String lastName, String email, String password) {

        Client client = clientDao.getById(id);

        client.setFirstName(firstName);
        client.setLastName(lastName);
        client.setEmail(email);
        client.setPassword(password);
        clientDao.save(client);

        return client;
    }


    @Override
    public Client findByName(final String firstName, String lastName) {

        return clientDao.getAll().stream()
                .filter(x -> x.getFirstName().equals(firstName))
                .filter(x -> x.getLastName().equals(lastName))
                .findFirst()
                .orElseThrow(UserNotFoundException::new);
    }
    @Override
    @Transactional
    public void deleteClient(Long id) {
        clientDao.delete(clientDao.getById(id));
    }
}
