package com.cinema.services;


import com.cinema.dao.ClientDaoImpl;
import com.cinema.dto.modelDto.ClientDto;
import com.cinema.dto.modelMappingDto.ClientMapper;
import com.cinema.service.ClientIService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor  // генерируе конструктор для всех final полей
@Service
public class ClientServiceImpl implements ClientIService {

    private final ClientDaoImpl clientDao;
    private final ClientMapper clientMapper;

    @Transactional
    public ClientDto addClient(ClientDto clientDto) {
        clientDao.save(clientMapper.toEntity(clientDto));
        return clientDto;
    }

    public List<ClientDto> getAllClients() {
        return clientDao.getAll().stream()              //создали из листа стирим
                .map(clientMapper::toDto)               //оператором из streamAPI map, использовали для каждого элемента метод toDto из класса clientMapper
                .collect(Collectors.toList());          //превратили стрим обратно в лист
    }

    public ClientDto getClient(Long id) {
        return clientMapper.toDto(                       //в метод toDto
                clientDao.getById(id));                   //поместили результат поиска по id
    }

    @Override
    @Transactional
    public ClientDto updateClient(ClientDto editClient) {
        clientDao.save(clientMapper.toEntity(editClient));
        return editClient;
    }

    @Override
    public ClientDto findByName(String firstName, String lastName) {
        return null;
    }

//    @Override
//    public ClientDto findByName(String firstName, String lastName) {
//
//        return clientDao.getAll().stream()
//                .filter(x -> x.getFirstName().equals(firstName))
//                .filter(x -> x.getLastName().equals(lastName))
//                .findFirst()
//                .orElseThrow(UserNotFoundException::new);
//    }
//
//    public ClientDto findBy() {
//
//    }


    @Override
    @Transactional
    public void deleteClient(Long id) {
        clientDao.delete(clientDao.getById(id));
    }
}
