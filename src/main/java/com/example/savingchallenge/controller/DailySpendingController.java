package com.example.savingchallenge.controller;

import com.example.savingchallenge.service.DailySpendingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import java.time.LocalDate;
import java.util.Map;

@RestController
@RequestMapping("/api/spending")
public class DailySpendingController {

    @Autowired
    private DailySpendingService dailySpendingService;

    @PostMapping("/check")
    public Map<String, Object> checkSpending(@RequestBody Map<String, Object> payload) {
        Long userId = Long.valueOf(payload.get("userId").toString());
        LocalDate date = LocalDate.parse(payload.get("date").toString());
        Double limitExpending = Double.valueOf(payload.get("limitExpending").toString());

        boolean isWithinLimit = dailySpendingService.checkSpendingLimit(userId, date, limitExpending);

        if (isWithinLimit) {
            return Map.of("success", true, "message", "Spending within limit");
        } else {
            return Map.of("success", false, "message", "Spending limit exceeded");
        }
    }
}