package com.Starchee.Tickets.repositories;

import com.Starchee.Tickets.entities.Owner;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketsRepository extends JpaRepository<Owner, Long> {
    Owner findOneBySurname(String surname);
}
