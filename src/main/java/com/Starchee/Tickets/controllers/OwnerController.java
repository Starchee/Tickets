package com.Starchee.Tickets.controllers;

import com.Starchee.Tickets.entities.Owner;
import com.Starchee.Tickets.services.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class OwnerController {
    private OwnerService ownerService;

    @Autowired
    public void setOwnerService(OwnerService ownerService){
        this.ownerService = ownerService;
    }

    @GetMapping("/search")
    public String searchPage(){
        return "search";
    }

    @GetMapping("/search/details")
    public String searchingBySurname(Model model, @RequestParam("surname") String surname) {
        Owner selectedOwner = ownerService.getOwnerBySurname(surname);
        model.addAttribute("selectedOwner", selectedOwner);
        return "details";
    }

    @GetMapping("")
    public String homePage(Model model){
        List<Owner> allOwners = ownerService.getAllOwners();
        model.addAttribute("owners", allOwners);
        return "homepage";
    }





}
