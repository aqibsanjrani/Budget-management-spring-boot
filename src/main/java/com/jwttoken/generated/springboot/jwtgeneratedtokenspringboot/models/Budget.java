package com.jwttoken.generated.springboot.jwtgeneratedtokenspringboot.models;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Budget")
public class Budget {
    @Id
    @GeneratedValue(generator = "budget_id")

    @Column(name = "budget_id")
    private Long budgetId;

    @Column(name = "amount")
    private Double amount;

    @Column(name = "startdate")
    private Date startDate;

    @Column(name = "enddate")
    private Date endDate;

    // Constructors, getters, and setters

    public Budget() {
    }

    public Budget(Double amount, Date startDate, Date endDate) {
        this.amount = amount;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    // Getters and setters

    public Long getBudgetId() {
        return budgetId;
    }

    public void setBudgetId(Long budgetId) {
        this.budgetId = budgetId;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

}

