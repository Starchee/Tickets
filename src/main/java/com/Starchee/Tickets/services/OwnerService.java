package com.Starchee.Tickets.services;

import com.Starchee.Tickets.entities.Owner;
import com.Starchee.Tickets.repositories.OwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OwnerService {
    private OwnerRepository ownerRepository;

    @Autowired
    public void setOwnerRepository(OwnerRepository ownerRepository){
        this.ownerRepository = ownerRepository;
    }

    public List<Owner> getAllOwners(){
        return ownerRepository.findAll();
    }

    public Owner getOwnerBySurname(String surname){
        return ownerRepository.findOneBySurname(surname);
    }
}
