package org.example;

import java.util.Scanner;

public class ExpensesTracker {
    public void start(){
        Scanner scanner = new Scanner(System.in);
        ExpenseManager expenseManager = new ExpenseManager();
        while(true){
            System.out.println("1. Show all expenses");
            System.out.println("2. Show expenses in picked month");
            System.out.println("3. Add expense");
            System.out.println("4. Finish app");
            System.out.println("Choose operation:");

            int choice = Integer.parseInt(scanner.nextLine());

            switch(choice){
                case 1 -> expenseManager.displayAllExpenses();
                case 2 -> expenseManager.displayMonthlyExpenses(scanner);
                case 3 -> expenseManager.addExpense(scanner);
                case 4 -> {
                    scanner.close();
                    System.exit(0);
                }
            }
        }
    }
}
