package com.Starchee.Tickets.entities;

import javax.persistence.*;

@Entity
@Table(name = "tickets")
public class Tickets {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "surname")
    private String surname;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Tickets(){

    }

    public Tickets(Long id, String surname, String name, String middleName) {
        this.id = id;
        this.surname = surname;

    }
}
