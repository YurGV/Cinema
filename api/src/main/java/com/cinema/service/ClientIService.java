package com.cinema.service;

import com.cinema.model.Client;

import java.util.List;

public interface ClientIService {

    Client addClient(String firstName, String lastName, String email, String password);
    Client getClient(Long id);
    List<Client> getAllClients();
    Client updateClient(Long id, String firstName, String lastName, String email, String password);
    Client findByName(String firstName, String lastName);
    void deleteClient(Long id);

}
