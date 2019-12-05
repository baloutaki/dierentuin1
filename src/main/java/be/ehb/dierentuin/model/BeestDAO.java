package be.ehb.dierentuin.model;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BeestDAO extends CrudRepository<Beest, Integer> {

    //dieren zoeken op soort
    Iterable<Beest> findBySoortOrderByNaam(String soort);

    @Query(value = "select b from Beest b where b.naam = :naam")
    Iterable<Beest> zoekBijNaam(String naam);
}
