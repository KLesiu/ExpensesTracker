package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.Double.parseDouble;

public class ExpenseManager {
    List<Expense> expenses = new ArrayList<>();

    public void displayAllExpenses(){
        expenses.forEach(ExpenseManager::displayExpense);
    }
    public static void displayExpense(Expense expense){
        System.out.println(expense.description());
        System.out.println(expense.type());
        System.out.println(expense.value());
        System.out.println(expense.month());
    }
    public void displayMonthlyExpenses(Scanner scanner){
        System.out.println("Which month do you want to display expenses from?");
        int month = Integer.parseInt(scanner.nextLine());
        
        expenses.stream()
                .filter(expense -> expense.month()==month)
                .forEach(ExpenseManager::displayExpense);
    }
    public void addExpense(Scanner scanner){
        System.out.println("What expense do you want do add?");
        String description = scanner.nextLine();
        System.out.println("What is category of this expense?");
        String type = scanner.nextLine();
        System.out.println("What is cost of this expense?");
        double value = Double.parseDouble(scanner.nextLine());
        System.out.println("In which month did you have this expense?");
        int month = Integer.parseInt(scanner.nextLine());

        Expense expense=new Expense(type,month,value,description);
        expenses.add(expense);

    }
}
