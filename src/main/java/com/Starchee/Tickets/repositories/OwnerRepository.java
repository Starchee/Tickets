package com.Starchee.Tickets.repositories;

import com.Starchee.Tickets.entities.Owner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OwnerRepository extends JpaRepository<Owner, Long> {
    Owner findOneBySurname(String surname);
}