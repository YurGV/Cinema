package com.cinema.dto.dozer;

import com.cinema.dto.modelDto.ClientDto;
import com.cinema.model.Client;
import org.dozer.DozerBeanMapper;
import org.dozer.DozerConverter;

public class ClientDozerConvert extends DozerConverter {

  DozerBeanMapper mapper = new DozerBeanMapper();

    public ClientDozerConvert(Class client, Class clientDto) {
        super(client, clientDto);
    }

    @Override
    public Object convertTo(Object client, Object clientDto) {
        Client clientEntity = new Client();
        return mapper.map(clientEntity, ClientDto.class);
    }

    @Override
    public Object convertFrom(Object client, Object clientDto) {
        ClientDto clDto = new ClientDto();
        return mapper.map(clDto, Client.class);
    }

}
