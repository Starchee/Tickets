package com.Starchee.Tickets.services;

import com.Starchee.Tickets.entities.Ticket;
import com.Starchee.Tickets.repositories.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketService {
    private TicketRepository ticketRepository;

    @Autowired
    public void setTicketRepository(TicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }

    public List<Ticket> getAllTickets(){
        return ticketRepository.findAll();
    }

    public List<Ticket> getAllTicketsByLastname(String lastname){
        return ticketRepository.findAllTicketsBySurname(lastname);
    }
}
