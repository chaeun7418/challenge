package com.example.savingchallenge.CategoryGoalTracker;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class service {
    private final repository accountRepository;

    @Autowired
    public service(repository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public String checkCategoryGoal(dto categoryGoalDTO) {
        long usageCount = accountRepository.countByCategoryId(categoryGoalDTO.getCategory());
        return usageCount <= categoryGoalDTO.getTimes() ? "Success" : "Failure";
    }
}

