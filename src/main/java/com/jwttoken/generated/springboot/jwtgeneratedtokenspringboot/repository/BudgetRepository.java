package com.jwttoken.generated.springboot.jwtgeneratedtokenspringboot.repository;


import com.jwttoken.generated.springboot.jwtgeneratedtokenspringboot.models.Budget;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BudgetRepository extends JpaRepository<Budget, Long> {
}
