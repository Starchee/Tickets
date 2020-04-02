package com.Starchee.Tickets.repositories;

import com.Starchee.Tickets.entities.Catalog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CatalogRepository extends JpaRepository<Catalog, Long> {
    @Query(value = "select catalog.*, count(*) from catalog left join tickets on catalog.id = " +
            "tickets.catalog_id group by catalog.id order by count desc limit 5;", nativeQuery = true)
    List<Catalog> findFivePopularTicketsFromCatalog();
}
