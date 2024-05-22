package com.example.savingchallenge.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "ACCOUNT") // 기존의 ACCOUNT 테이블을 사용
public class DailySpending {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "amount")
    private Double amount;

    @Column(name = "spending_date")
    private LocalDate spendingDate;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public LocalDate getSpendingDate() {
        return spendingDate;
    }

    public void setSpendingDate(LocalDate spendingDate) {
        this.spendingDate = spendingDate;
    }
}
