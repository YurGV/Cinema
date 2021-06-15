package service;

import model.Client;

import java.util.List;

public interface ClientIService {

    Client addClient(String firstName, String lastName, String email, String password);
    Client getClient(Long id);
    List<Client> getAllClients();
    Client editClient(Long id, String firstName, String lastName, String email, String password);
    //Optional пусть возвращает ДАО, а сервис должен обработать этот опшнал и вернуть либо клиента либо нал, иначе ты в контроллере будешь пилить логику конвертации
    Client findByName(String firstName, String lastName);
    void deleteClient(Long id);

}
