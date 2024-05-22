package com.example.savingchallenge.service;

import com.example.savingchallenge.repository.CategoryGoalTrackerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryGoalTrackerService {

    @Autowired
    private AccountRepository accountRepository;

    public String checkCategoryGoal(Long accountId, String category, int times) {
        int count = accountRepository.countByAccountIdAndCategory(accountId, category);
        return count < times ? "SUCCESS" : "FAILURE";
    }
}
