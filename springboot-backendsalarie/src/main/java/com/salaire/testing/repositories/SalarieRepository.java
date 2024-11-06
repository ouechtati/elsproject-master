package com.test.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.model.Salarie;

@Repository
public interface SalarieRepository extends JpaRepository<Salarie, Long> {

}
