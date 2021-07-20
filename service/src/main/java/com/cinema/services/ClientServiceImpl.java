package com.cinema.services;


import com.cinema.dao.ClientDaoImpl;
import com.cinema.dto.modelDto.ClientDto;
import com.cinema.dto.converter.MappingUtils;
import com.cinema.service.ClientIService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
// реализация, если она не абстракт, должна имплементить все методы интерфейса
public class ClientServiceImpl implements ClientIService {

    @Autowired
    private final ClientDaoImpl clientDao;

    @Autowired
    private final ClientDto clientDto;

    @Autowired
    private final MappingUtils mappingUtils;

    @Transactional
    public ClientDto addClient() {

        clientDao.save(mappingUtils.mapToClientEntity(new ClientDto()));
        return clientDto;
    }

    public List<ClientDto> getAllClients() {
        return clientDao.getAll().stream()              //создали из листа стирим
                .map(mappingUtils::mapToClientDto)      //оператором из streamAPI map, использовали для каждого элемента метод mapToProductDto из класса MappingUtils
                .collect(Collectors.toList());          //превратили стрим обратно в лист
    }

    public ClientDto getClient(Long id) {
        return mappingUtils.mapToClientDto(             //в метод mapToProductDto
                clientDao.getById(id));                   //поместили результат поиска по id
    }

    @Override
    @Transactional
    public ClientDto updateClient(ClientDto editClientDto) {

        clientDao.save(mappingUtils.mapToClientEntity(editClientDto));
        return clientDto;
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
