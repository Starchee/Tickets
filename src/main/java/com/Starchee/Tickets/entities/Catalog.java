package com.Starchee.Tickets.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Catalog")
public class Catalog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "type")
    private String type;
    @Column(name = "description")
    private String description;
    @Column(name = "price")
    private float price;

    @OneToMany(mappedBy = "catalog")
    private List<Ticket> tickets;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public List<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }

    public Catalog() {
    }

    public Catalog(String type, String description, float price, List<Ticket> tickets) {
        this.type = type;
        this.description = description;
        this.price = price;
        this.tickets = tickets;
    }
}
