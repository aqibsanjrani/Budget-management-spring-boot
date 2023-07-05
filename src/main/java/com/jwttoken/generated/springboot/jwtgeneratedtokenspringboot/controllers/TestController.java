package com.jwttoken.generated.springboot.jwtgeneratedtokenspringboot.controllers;

import com.jwttoken.generated.springboot.jwtgeneratedtokenspringboot.models.User;
import com.jwttoken.generated.springboot.jwtgeneratedtokenspringboot.security.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/test")
public class TestController {

  @Autowired
  private UserService userService;

  @GetMapping("/all")
  public String allAccess() {
    return "Public Content.";
  }

  @GetMapping("/user")
  @PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
  public String userAccess() {
    return "User Content.";
  }

  @GetMapping("/mod")
  @PreAuthorize("hasRole('MODERATOR')")
  public String moderatorAccess() {
    return "Moderator Board.";
  }

  @GetMapping("/admin")
  @PreAuthorize("hasRole('ADMIN')")
  public String adminAccess() {
    return "Admin Board.";
  }

  @GetMapping("/getAllUsers") // Get All Records
  public ResponseEntity<List<User>> getAllExpenses() {
    List<User> expenses = userService.getAllExpenses();
    return new ResponseEntity<>(expenses, HttpStatus.OK);
  }


  @DeleteMapping("/{id}") // Deleted Record by user ID
  public String deleteExpense(@PathVariable Long id) {
    userService.deleteExpense(id);
    //    return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    return "User Record deleted Successfully";
  }

}
