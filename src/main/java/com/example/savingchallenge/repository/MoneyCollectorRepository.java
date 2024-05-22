package com.example.savingchallenge.repository;

import com.example.savingchallenge.model.MoneyCollector;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MoneyCollectorRepository extends JpaRepository<MoneyCollector, Long> {
}
