package com.test.repositories;

import com.test.model.Client;
import com.test.model.Destination;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DestinationRepository extends JpaRepository<Destination, Integer> {
}
