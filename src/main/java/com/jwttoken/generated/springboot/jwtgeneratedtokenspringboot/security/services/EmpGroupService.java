package com.jwttoken.generated.springboot.jwtgeneratedtokenspringboot.security.services;


import com.jwttoken.generated.springboot.jwtgeneratedtokenspringboot.models.EmpGroup;

public interface EmpGroupService {
    EmpGroup createEmpGroup(int empGroupId, int employerId, int budgetId);
}
