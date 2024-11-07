package Bank;

import java.util.Scanner;

public class Bank {
    public static void greetUser() {
        System.out.println("Welcome to the Bank! We're glad to assist you.");
    }
    public static int addNumbers(int num1, int num2) {
        return num1 + num2;  // Return the sum of num1 and num2
    }
    public static double calculateArea(double length, double width) {
        return length * width;  // Return the area of the rectangle
    }
    public static void printNumbers(int... numbers) {
        System.out.println("Numbers received:");
        for (int num : numbers) {
            System.out.println(num);
        }
    }
    
    public static void main(String[] args) {
        // Basic Arithmetic Operations with Switch Case
        int num1 = 10;
        int num2 = 5;
        int result = 0;
        char operator = '+'; // Change this to other operators for different operations

        System.out.println("Arithmetic Operations:");

        // Switch-case to handle different operations
        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("Addition: " + num1 + " + " + num2 + " = " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Subtraction: " + num1 + " - " + num2 + " = " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Multiplication: " + num1 + " * " + num2 + " = " + result);
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Division: " + num1 + " / " + num2 + " = " + result);
                } else {
                    System.out.println("Division by zero is not allowed!");
                }
                break;
            case '%':
                result = num1 % num2;
                System.out.println("Modulus: " + num1 + " % " + num2 + " = " + result);
                break;
            default:
                System.out.println("Invalid operator!");
        }

        // Conditional check for eligibility (Example: Bank Loan)
        int age = 21;
        int salary = 25000;
        boolean hasGoodCreditScore = true;
        
        System.out.println("\nEligibility check:");

        if (age > 18 && salary > 20000 && hasGoodCreditScore) {
            System.out.println("You are eligible for a loan.");
        } else {
            System.out.println("You are not eligible for a loan.");
        }

        // Diamond pattern using loops
        System.out.println("\nDiamond Pattern:");

        int n = 5;  // Number of rows
        for (int i = 1; i <= n; i++) {
            // Spaces before stars
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            // Stars
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println(); 
        }
        
        for (int i = n - 1; i >= 1; i--) {
            // Spaces before stars
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            // Stars
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println(); 
        }

        // Number Pattern (1, 1 2, 1 2 3, etc.)
        System.out.println("\nNumber Pattern:");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println(); 
        }

        // Using While Loop: Display first 10 natural numbers
        System.out.println("\nFirst 10 natural numbers using While loop:");
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();

        // Using Do-While Loop: Sum of first 5 numbers
        System.out.println("\nSum of first 5 numbers using Do-While loop:");
        int sum = 0;
        int j = 1;
        do {
            sum += j;
            j++;
        } while (j <= 5);
        System.out.println("Sum: " + sum);

        // Switch Case for Account Type Selection
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter your account type (1 for Saving, 2 for Checking, 3 for Business):");
        int accountType = sc.nextInt();
        switch (accountType) {
            case 1:
                System.out.println("You have selected Saving Account.");
                break;
            case 2:
                System.out.println("You have selected Checking Account.");
                break;
            case 3:
                System.out.println("You have selected Business Account.");
                break;
            default:
                System.out.println("Invalid account type!");
        }

        // Nested Loops Example: Table of 2
        System.out.println("\nMultiplication Table of 2 using Nested Loops:");
        for (int m = 1; m <= 10; m++) {
            System.out.println("2 * " + m + " = " + (2 * m));
        }

        // Control Statement Example (Break and Continue)
        System.out.println("\nBreak and Continue Example:");
        for (int k = 1; k <= 10; k++) {
            if (k == 5) {
                System.out.println("Skipping number 5.");
                continue; // Skip number 5
            }
            if (k == 8) {
                System.out.println("Stopping the loop at number 8.");
                break; // Break out of the loop at number 8
            }
            System.out.println("Number: " + k);
        }
         
        greetUser();
        int sum2 = addNumbers(10, 5);  // Passing 10 and 5 as arguments
        System.out.println("The sum of 10 and 5 is: " + sum2);
        double area = calculateArea(5.5, 3.2);  // Passing length and width as arguments
        System.out.println("The area of the rectangle is: " + area);
        printNumbers(1, 2, 3, 4, 5);  // Passing multiple arguments
        printNumbers(10, 20); 
        // Closing Scanner
        sc.close();
    }
}
