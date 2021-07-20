package com.cinema.dto.modelMappingDto;

import com.cinema.dto.modelDto.TicketDto;
import com.cinema.model.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TicketMapper extends AbstractMapper<Ticket,TicketDto>{

    @Autowired
    public TicketMapper() {
        super(Ticket.class, TicketDto.class);
    }
}
