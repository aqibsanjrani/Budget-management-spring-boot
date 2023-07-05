package com.jwttoken.generated.springboot.jwtgeneratedtokenspringboot.security.services;

import com.jwttoken.generated.springboot.jwtgeneratedtokenspringboot.models.User;
import com.jwttoken.generated.springboot.jwtgeneratedtokenspringboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class EmployerServiceimpl implements UserService {

    @Autowired
    private UserRepository expenseRepository;

    public EmployerServiceimpl(UserRepository expenseRepository) {
        this.expenseRepository = expenseRepository;
    }

    @Override
    public List<User> getAllExpenses() {
        return expenseRepository.findAll();
    }

    @Override
    public String deleteExpense(Long id) {
        expenseRepository.deleteById(id);
    return "Your Delete user is successfully";
    }

    // Other methods as needed
}

