package com.jwttoken.generated.springboot.jwtgeneratedtokenspringboot.security.services;


import com.jwttoken.generated.springboot.jwtgeneratedtokenspringboot.models.Expense;

import java.math.BigDecimal;
import java.util.Date;

public interface ExpenseService {
    Expense createExpense(int consumerId, BigDecimal amount, Date date, int empGroupId, String description);
}
