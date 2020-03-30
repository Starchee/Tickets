package com.Starchee.Tickets.repositories;

import com.Starchee.Tickets.entities.Tickets;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketsRepository extends JpaRepository<Tickets, Long> {
    Tickets findOneBySurname(String surname);
}
