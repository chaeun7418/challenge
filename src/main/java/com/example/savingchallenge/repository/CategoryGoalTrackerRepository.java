package com.example.savingchallenge.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryGoalTrackerRepository extends JpaRepository<Account, Long>{
    int countByAccountIdAndCategory(Long accountId, String category);
}
