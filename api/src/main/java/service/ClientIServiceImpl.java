package service;

import model.Client;

import java.util.List;
import java.util.Optional;

public interface ClientIServiceImpl {

    Client addClient(String firstName, String lastName, String email, String password);
    Client getClient(Long id);
    List<Client> getClients();
    Client editClient(Long id, String firstName, String lastName, String email, String password);
    Optional<Client> findByName(String firstName, String lastName);
    void deleteClient(Long id);

}
