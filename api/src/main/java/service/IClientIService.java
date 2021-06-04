package service;

import model.Client;

import java.util.List;

public interface IClientIService {

    Client addClient(String firstName, String lastName, String email, String password);
    Client getClient(Long id);
    List<Client> getClients();
    Client editClient(String firstName, String lastName, String email, String password);
    Client findByName(String firstName, String lastName);
    void deleteClient(Long id);

}
