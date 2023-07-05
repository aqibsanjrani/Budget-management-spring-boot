package com.jwttoken.generated.springboot.jwtgeneratedtokenspringboot.security.services;


import com.jwttoken.generated.springboot.jwtgeneratedtokenspringboot.models.Budget;
import com.jwttoken.generated.springboot.jwtgeneratedtokenspringboot.models.EmpGroup;
import com.jwttoken.generated.springboot.jwtgeneratedtokenspringboot.models.User;
import com.jwttoken.generated.springboot.jwtgeneratedtokenspringboot.repository.BudgetRepository;
import com.jwttoken.generated.springboot.jwtgeneratedtokenspringboot.repository.EmpGroupRepository;
import com.jwttoken.generated.springboot.jwtgeneratedtokenspringboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpGroupServiceImpl implements EmpGroupService {

    @Autowired
    private EmpGroupRepository empGroupRepository;

    @Autowired
    private BudgetRepository budgetRepository;

    @Autowired
    private UserRepository employerRepository;

    @Autowired
    public EmpGroupServiceImpl(EmpGroupRepository empGroupRepository) {
        this.empGroupRepository = empGroupRepository;
    }

    @Override
    public EmpGroup createEmpGroup(int empGroupId, int employerId, int budgetId) {
        EmpGroup empGroup = new EmpGroup();
        empGroup.setGroupId(empGroupId);

        // Fetch the related employer and budget entities
        User employer = employerRepository.findById((long) employerId)
                .orElseThrow(() -> new IllegalArgumentException("Employer not found with ID: " + employerId));
        empGroup.setEmployer(employer);

        Budget budget = budgetRepository.findById((long) budgetId)
                .orElseThrow(() -> new IllegalArgumentException("Budget not found with ID: " + budgetId));
        empGroup.setBudget(budget);

        return empGroupRepository.save(empGroup);
    }
}

