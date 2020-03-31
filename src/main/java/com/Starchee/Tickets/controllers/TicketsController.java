package com.Starchee.Tickets.controllers;

import com.Starchee.Tickets.entities.Owner;
import com.Starchee.Tickets.services.TicketsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class TicketsController {
    private TicketsService ticketsService;

    @Autowired
    public void setTicketsService(TicketsService ticketsService){
        this.ticketsService = ticketsService;
    }

    @GetMapping("/search")
    public String searchPage(){
        return "search";
    }

    @GetMapping("/search/details")
    public String searchingBySurname(Model model, @RequestParam("surname") String surname) {
        Owner selectedOwner = ticketsService.getTicketsBySurname(surname);
        model.addAttribute("selectedTickets", selectedOwner);
        return "details";
    }

    @GetMapping("")
    public String homePage(Model model){
        List<Owner> allTickets = ticketsService.getAllTickets();
        model.addAttribute("tickets", allTickets);
        return "homepage";
    }





}
