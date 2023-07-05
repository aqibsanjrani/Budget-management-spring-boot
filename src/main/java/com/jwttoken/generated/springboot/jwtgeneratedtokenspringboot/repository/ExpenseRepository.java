package com.jwttoken.generated.springboot.jwtgeneratedtokenspringboot.repository;

import com.jwttoken.generated.springboot.jwtgeneratedtokenspringboot.models.Expense;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpenseRepository extends JpaRepository<Expense, Integer> {
}
