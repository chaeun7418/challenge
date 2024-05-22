package com.example.savingchallenge.repository;

import com.example.savingchallenge.model.DailySpending;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.Optional;

public interface DailySpendingRepository extends JpaRepository<DailySpending, Long> {

    @Query("SELECT SUM(ds.amount) FROM DailySpending ds WHERE ds.userId = :userId AND ds.spendingDate = :spendingDate")
    Optional<Double> findTotalSpendingByUserIdAndDate(@Param("userId") Long userId, @Param("spendingDate") LocalDate spendingDate);
}
