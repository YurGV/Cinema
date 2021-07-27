package com.cinema.services;

import com.cinema.dao.TicketDao;
import com.cinema.service.TicketService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@RequiredArgsConstructor
@Service
public class TicketServiceImpl implements TicketService {


    private final TicketDao ticketDao;

}
