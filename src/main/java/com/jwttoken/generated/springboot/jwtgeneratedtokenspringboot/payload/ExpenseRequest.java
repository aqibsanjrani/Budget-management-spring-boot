package com.jwttoken.generated.springboot.jwtgeneratedtokenspringboot.payload;

import java.math.BigDecimal;
import java.util.Date;

public class ExpenseRequest {
    private int consumerId;
    private BigDecimal amount;
    private Date date;
    private int empGroupId;
    private String description;

    // Constructors, getters, and setters


    public int getConsumerId() {
        return consumerId;
    }

    public void setConsumerId(int consumerId) {
        this.consumerId = consumerId;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getEmpGroupId() {
        return empGroupId;
    }

    public void setEmpGroupId(int empGroupId) {
        this.empGroupId = empGroupId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
