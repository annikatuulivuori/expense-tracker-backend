package com.example.expensetrackerbackend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

import dto.Expense;

@RestController
@RequestMapping("/api/expenses")
public class ExpenseController {
    private List<Expense> expenses = new ArrayList<>();

    @GetMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @PostMapping("/addExpense")
    public List<Expense> addExpense(Expense expense) {
        expenses.add(expense);
        return expenses;
    }

    @GetMapping("/viewExpenses")
    public List<Expense> viewExpenses() {
        return expenses;
    }

}
