package com.cinema.dto.modelMappingDto;

import com.cinema.dto.modelDto.ClientDto;
import com.cinema.model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ClientMapper extends AbstractMapper<Client, ClientDto> {

    @Autowired
    public ClientMapper() {
        super(Client.class, ClientDto.class);
    }
}
