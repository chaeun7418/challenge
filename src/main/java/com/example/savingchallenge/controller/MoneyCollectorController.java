package com.example.savingchallenge.controller;

import com.example.savingchallenge.service.MoneyCollectorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/collect")
public class MoneyCollectorController {

    @Autowired
    private MoneyCollectorService moneyCollectorService;

    @PostMapping
    public ResponseEntity<String> collectMoney(@RequestParam int period, @RequestParam double totalMoney) {
        if(period <= 0 || totalMoney <= 0) {
            return ResponseEntity.badRequest().body("Period and totalMoney must be positive values.");
        }

        moneyCollectorService.saveMoneyCollector(period, totalMoney);
        return ResponseEntity.status(HttpStatus.CREATED).body("Successfully collected money.");
    }
}
