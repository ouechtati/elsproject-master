package com.test.repositories;

import com.test.model.Client;
import com.test.model.Guide;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GuideRepository extends JpaRepository<Guide, Integer> {
}
