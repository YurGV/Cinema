package com.cinema.service;

import com.cinema.dto.modelDto.ClientDto;

import java.util.List;

public interface ClientIService {

    ClientDto addClient(ClientDto clientDto);
    ClientDto getClient(Long id);
    List<ClientDto> getAllClients();
    ClientDto updateClient(ClientDto editClient);
    ClientDto findByName(String firstName, String lastName);
    void deleteClient(Long id);

}
