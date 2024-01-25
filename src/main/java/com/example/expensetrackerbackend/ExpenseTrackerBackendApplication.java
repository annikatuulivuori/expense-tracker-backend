package com.example.expensetrackerbackend;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import dto.Expense;
import com.example.expensetrackerbackend.controller.ExpenseController;

@SpringBootApplication
public class ExpenseTrackerBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExpenseTrackerBackendApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(ExpenseController expenseController) {
		return args -> {

			expenseController.addExpense(new Expense(1, "Cat Food", 154.94));
			expenseController.addExpense(new Expense(2, "Litter", 27.99));

			List<Expense> allExpenses = expenseController.viewExpenses();
			System.out.println("All Expenses:");
			allExpenses.forEach(expense -> {
				System.out.println("Description: " + expense.getDesc() + ", Amount: $" + expense.getAmount());
			});

		};
	}

}
