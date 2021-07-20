package com.cinema.service;

import com.cinema.dto.modelDto.ClientDto;

import java.util.List;

public interface ClientIService {

    ClientDto addClient();
    ClientDto getClient(Long id);
    List<ClientDto> getAllClients();
    ClientDto updateClient(ClientDto editClientDto);
    ClientDto findByName(String firstName, String lastName);
    void deleteClient(Long id);

}
