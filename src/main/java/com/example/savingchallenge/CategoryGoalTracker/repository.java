package com.example.savingchallenge.CategoryGoalTracker;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface repository extends JpaRepository<domain, Long> {
    long countByCategoryId(String categoryId);
}

