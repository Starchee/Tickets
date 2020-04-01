package com.Starchee.Tickets.services;

import com.Starchee.Tickets.entities.Catalog;
import com.Starchee.Tickets.repositories.CatalogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatalogService {
    private CatalogRepository catalogRepository;

    @Autowired
    public void setCatalogRepository(CatalogRepository catalogRepository) {
        this.catalogRepository = catalogRepository;
    }

    public List<Catalog> getAll(){
        return catalogRepository.findAll();
    }
}
