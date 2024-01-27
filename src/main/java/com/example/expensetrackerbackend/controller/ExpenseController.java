package com.example.expensetrackerbackend.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import dto.Expense;

@RestController
@RequestMapping("/api/expenses")
@CrossOrigin(origins = "http://localhost:3000")
public class ExpenseController {
    private static final Logger LOGGER = LoggerFactory.getLogger(ExpenseController.class);
    private List<Expense> expenses = new ArrayList<>();

    @GetMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @PostMapping("/addExpense")
    public void addExpense(@RequestBody Expense expense) {
        LOGGER.info("Received request to addExpense: {} ", expense);

        expenses.add(expense);

        LOGGER.info("New expense added successfully.");
    }

    @GetMapping("/viewExpenses")
    public List<Expense> viewExpenses() {
        LOGGER.info("Received request to viewExpenses.");

        return expenses;
    }

    @DeleteMapping("/deleteExpense/{expenseId}")
    public List<Expense>  deleteExpense(@PathVariable int expenseId) {
        LOGGER.info("Received request to deleteExpense with id: {}", expenseId);

        expenses = expenses.stream()
                .filter(expense -> expense.getId() != expenseId)
                .collect(Collectors.toList());

        LOGGER.info("Expense with id {} deleted successfully.", expenseId);

        return expenses;
    }

}
