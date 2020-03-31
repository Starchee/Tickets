package com.Starchee.Tickets.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Owners")
public class Owner {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "surname")
    private String surname;

    @OneToMany(mappedBy = "owner")
    private List<Car> cars;

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

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    public Owner(){

    }

    public Owner(String surname, List<Car> cars) {
        this.surname = surname;
        this.cars = cars;
    }
}
