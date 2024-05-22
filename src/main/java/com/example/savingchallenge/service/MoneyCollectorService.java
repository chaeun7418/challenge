package com.example.savingchallenge.service;

import com.example.savingchallenge.model.MoneyCollector;
import com.example.savingchallenge.repository.MoneyCollectorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MoneyCollectorService {

    @Autowired
    private MoneyCollectorRepository moneyCollectorRepository;

    public MoneyCollector saveMoneyCollector(int period, double totalMoney) {
        double collectedValue = (period / 30.0) * totalMoney;
        MoneyCollector moneyCollector = new MoneyCollector(period, collectedValue);
        return moneyCollectorRepository.save(moneyCollector);
    }
}
