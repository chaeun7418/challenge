package com.example.savingchallenge.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Table(name="CHALLENGE")
public class MoneyCollector {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int period;
    private double totalMoney;

    public MoneyCollector() {}

    public MoneyCollector(int period, double totalMoney) {
        this.period = period;
        this.totalMoney = totalMoney;
    }

    public Long getId() {
        return id;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    public double getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(double totalMoney) {
        this.totalMoney = totalMoney;
    }
}