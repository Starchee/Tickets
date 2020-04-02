package com.Starchee.Tickets.controllers;

import com.Starchee.Tickets.entities.Catalog;
import com.Starchee.Tickets.entities.Ticket;
import com.Starchee.Tickets.services.CatalogService;
import com.Starchee.Tickets.services.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class TicketController {
    private TicketService ticketService;
    private CatalogService catalogService;

    @Autowired
    public void setTicketService(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    @Autowired
    public void setCatalogService(CatalogService catalogService) {
        this.catalogService = catalogService;
    }




    @GetMapping("/search")
    public String searchPage(){
        return "search";
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }


    @GetMapping("/search/details")
    public String searchingByLastname(Model model, @RequestParam("lastname") String lastname) {
        List<Ticket> allTicketsByLastname = null;
        allTicketsByLastname = ticketService.getAllTicketsByLastname(lastname);
        model.addAttribute("allTicketsByLastname", allTicketsByLastname);
        return "details";
    }

    @GetMapping("/search/details/catalog")
    public String catalog(Model model) {
        List<Catalog> catalog = catalogService.getAll();
        model.addAttribute("catalog", catalog);
        return "catalog";
    }

    @GetMapping("/topFive")
    public String searchingByLastname(Model model) {
        List<Catalog> fivePopularTicketsFromCatalog = catalogService.getFivePopularTicketsFromCatalog();
        model.addAttribute("fivePopularTicketsFromCatalog", fivePopularTicketsFromCatalog);
        return "topFive";
    }



    @GetMapping("")
    public String homePage(Model model){
        List<Ticket> allTickets = ticketService.getAllTickets();
        model.addAttribute("tickets", allTickets);
        return "homepage";
    }





}
