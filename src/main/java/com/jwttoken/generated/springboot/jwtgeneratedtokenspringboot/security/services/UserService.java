package com.jwttoken.generated.springboot.jwtgeneratedtokenspringboot.security.services;

import com.jwttoken.generated.springboot.jwtgeneratedtokenspringboot.models.User;

import java.util.List;

public interface UserService {

    List<User> getAllExpenses() ;

    String deleteExpense(Long id);
}