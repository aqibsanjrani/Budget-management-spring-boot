package com.jwttoken.generated.springboot.jwtgeneratedtokenspringboot.security.services;


import com.jwttoken.generated.springboot.jwtgeneratedtokenspringboot.models.Budget;

import java.util.List;

public interface BudgetService {
    Budget createBudget(Budget budget);

    List<Budget> getAllBudgets();

    Budget getBudgetById(Long budgetId);

    Budget updateBudget(Budget budget);

    String deleteBudget(Long budgetId);
}
