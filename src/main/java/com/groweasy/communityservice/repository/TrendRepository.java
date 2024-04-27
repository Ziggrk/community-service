package com.groweasy.communityservice.repository;

import com.groweasy.communityservice.model.Trend;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrendRepository extends JpaRepository<Trend, Long> {

    Boolean existsByName(String name);
}
