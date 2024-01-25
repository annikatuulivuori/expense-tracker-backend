package com.example.expensetrackerbackend.controller;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
    public void addExpense(Expense expense) {
        expenses.add(expense);
    }

    @GetMapping("/viewExpenses")
    public List<Expense> viewExpenses() {

        return expenses;
    }

    @DeleteMapping("/deleteExpense/{expenseId")
    public List<Expense>  deleteExpense(@PathVariable int expenseId) {
        expenses = expenses.stream()
                .filter(expense -> expense.getId() != expenseId)
                .collect(Collectors.toList());

        return expenses;
    }

}
