package com.example.savingchallenge.CategoryGoalTracker;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/category-goal")
public class controller {
    private final service categoryGoalTrackerService;

    @Autowired
    public controller(service categoryGoalTrackerService) {
        this.categoryGoalTrackerService = categoryGoalTrackerService;
    }

    @PostMapping
    public ResponseEntity<String> checkCategoryGoal(@RequestBody dto categoryGoalDTO) {
        String result = categoryGoalTrackerService.checkCategoryGoal(categoryGoalDTO);
        return ResponseEntity.ok(result);
    }
}

