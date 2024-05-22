package com.example.savingchallenge.controller;

import com.example.savingchallenge.service.CategoryGoalTrackerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/category-goal-tracker")
public class CategoryGoalTrackerController {

    @Autowired
    private CategoryGoalTrackerService categoryGoalTrackerService;

    @GetMapping("/check")
    public String checkCategoryGoal(@RequestParam Long accountId, @RequestParam String category, @RequestParam int times) {
        return categoryGoalTrackerService.checkCategoryGoal(accountId, category, times);
    }
}
