package com.jwttoken.generated.springboot.jwtgeneratedtokenspringboot.models;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "consumered")
public class Expense {

    @Id
    @GeneratedValue(generator = "consumered_id")
    @Column(name = "consumered_id")
    private int id;

    @Column(name = "amount")
    private BigDecimal amount;

    @Column(name = "dated")
    private Date date;

    @ManyToOne
    @JoinColumn(name = "emp_group_id")
    private EmpGroup empGroup;

    @Column(name = "description")
    private String description;

    // Constructors, getters, and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public EmpGroup getEmpGroup() {
        return empGroup;
    }

    public void setEmpGroup(EmpGroup empGroup) {
        this.empGroup = empGroup;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

