package com.Starchee.Tickets.services;

import com.Starchee.Tickets.entities.Owner;
import com.Starchee.Tickets.repositories.TicketsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketsService {
    private TicketsRepository ticketsRepository;

    @Autowired
    public void setTicketsRepository(TicketsRepository ticketsRepository){
        this.ticketsRepository = ticketsRepository;
    }

    public List<Owner> getAllTickets(){
        return ticketsRepository.findAll();
    }

    public Owner getTicketsBySurname(String surname){
        return ticketsRepository.findOneBySurname(surname);
    }
}
