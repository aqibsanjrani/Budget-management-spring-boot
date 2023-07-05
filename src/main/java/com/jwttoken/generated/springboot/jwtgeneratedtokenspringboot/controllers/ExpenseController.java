package com.jwttoken.generated.springboot.jwtgeneratedtokenspringboot.controllers;

import com.jwttoken.generated.springboot.jwtgeneratedtokenspringboot.models.Expense;
import com.jwttoken.generated.springboot.jwtgeneratedtokenspringboot.payload.ExpenseRequest;
import com.jwttoken.generated.springboot.jwtgeneratedtokenspringboot.security.services.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.Date;

@RestController
@RequestMapping("/expenses")
public class ExpenseController {

    @Autowired
    private ExpenseService expenseService;

    @Autowired
    public ExpenseController(ExpenseService expenseService) {
        this.expenseService = expenseService;
    }

    @PostMapping //Request for budget
    public Expense createExpense(@RequestBody ExpenseRequest request) {
        int consumerId = request.getConsumerId();
        BigDecimal amount = request.getAmount();
        Date date = request.getDate();
        int empGroupId = request.getEmpGroupId();
        String description = request.getDescription();
        return expenseService.createExpense(consumerId, amount, date, empGroupId, description);
    }

    // Other controller methods
}
