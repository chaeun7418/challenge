package com.example.savingchallenge.service;

import com.example.dailyspending.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class DailySpendingService {

    @Autowired
    private AccountRepository accountRepository;

    public boolean checkSpendingLimit(Long userId, LocalDate date, Double limitExpending) {
        Double totalSpending = accountRepository.findTotalSpendingByUserIdAndDate(userId, date).orElse(0.0);
        return totalSpending <= limitExpending;
    }
}
