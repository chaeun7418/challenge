package com.example.savingchallenge.CategoryGoalTracker;


import jakarta.persistence.*;

@Entity
@Table(name = "ACCOUNT")
public class domain {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "category_id")
    private String categoryId;

    // Other fields and getters/setters

    // Getters and setters
    // ...
}

