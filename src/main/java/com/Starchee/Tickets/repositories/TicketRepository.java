package com.Starchee.Tickets.repositories;

import com.Starchee.Tickets.entities.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TicketRepository extends JpaRepository<Ticket,Long> {

    @Query(value = "select tickets.* from owners left join cars on cars.owner_id = owners.id " +
            " left join tickets on tickets.car_id = cars.id where owners.lastname = ?1 ",nativeQuery = true)
    List<Ticket> findAllTicketBySurname(String surname);


}

