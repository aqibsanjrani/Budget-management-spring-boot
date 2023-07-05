package com.jwttoken.generated.springboot.jwtgeneratedtokenspringboot.models;
import javax.persistence.*;

@Entity
@Table(name = "employer_group")
public class EmpGroup {
    @Id
    @GeneratedValue (generator = "emp_group_id")

    @Column(name = "emp_group_id")
    private int groupId;

    @ManyToOne
    @JoinColumn(name = "employers_id")
    private User employer;

    @ManyToOne
    @JoinColumn(name = "budget_id")
    private Budget budget;

    // Constructors, getters, and setters

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public User getEmployer() {
        return employer;
    }

    public void setEmployer(User employer) {
        this.employer = employer;
    }

    public Budget getBudget() {
        return budget;
    }

    public void setBudget(Budget budget) {
        this.budget = budget;
    }
}

