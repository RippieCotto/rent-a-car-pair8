package com.tobeto.pair8.repositories;

import com.tobeto.pair8.entities.Rental;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RentalRepository extends JpaRepository<Rental, Integer> {
}
