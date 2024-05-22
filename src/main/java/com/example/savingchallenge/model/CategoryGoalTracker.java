package com.example.savingchallenge.model;

import javax.persistence.*;

@Entity
@Table(name = "ACCOUNT")
public class CategoryGoalTracker{
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long accountId;

@Column(name = "category")
private String category;

@Column(name = "count")
private int count;

// Getters and Setters
public Long getAccountId() {
    return accountId;
}

public void setAccountId(Long accountId) {
    this.accountId = accountId;
}

public String getCategory() {
    return category;
}

public void setCategory(String category) {
    this.category = category;
}

public int getCount() {
    return count;
}

public void setCount(int count) {
    this.count = count;
}
}
