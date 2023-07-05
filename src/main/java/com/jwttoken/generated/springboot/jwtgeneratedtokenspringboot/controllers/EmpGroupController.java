package com.jwttoken.generated.springboot.jwtgeneratedtokenspringboot.controllers;

import com.jwttoken.generated.springboot.jwtgeneratedtokenspringboot.models.EmpGroup;
import com.jwttoken.generated.springboot.jwtgeneratedtokenspringboot.payload.EmpGroupRequest;
import com.jwttoken.generated.springboot.jwtgeneratedtokenspringboot.security.services.EmpGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/emp-groups")
public class EmpGroupController {

    @Autowired
    private EmpGroupService empGroupService;

    @Autowired
    public EmpGroupController(EmpGroupService empGroupService) {
        this.empGroupService = empGroupService;
    }

    @PostMapping// Create the Employer group Data
    public EmpGroup createEmpGroup(@RequestBody EmpGroupRequest request) {
        int empGroupId = request.getEmpGroupId();
        int employerId = request.getEmployerId();
        int budgetId = request.getBudgetId();
        return empGroupService.createEmpGroup(empGroupId, employerId, budgetId);
    }

    // Other controller methods
}

