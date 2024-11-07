package JDBC;

public class JDBC {


public static void main(String[] args) {
		 int num1 = 10;
	        int num2 = 5;
	        int sum = num1 + num2;
	        System.out.println("Addition: " + num1 + " + " + num2 + " = " + sum);
	        int difference = num1 - num2;
	        System.out.println("Subtraction: " + num1 + " - " + num2 + " = " + difference);
	        int product = num1 * num2;
	        System.out.println("Multiplication: " + num1 + " * " + num2 + " = " + product);
	        int quotient = num1 / num2;
	        System.out.println("Division: " + num1 + " / " + num2 + " = " + quotient);
	        int remainder = num1 % num2;
	        System.out.println("Modulus: " + num1 + " % " + num2 + " = " + remainder);
	        int num=21;
	        if(num>0)
	        {
	      	  if (num==20)
	      	  {
	      		  System.out.println("You are eligible");
	      	  }
	      	  else {
	      		  System.out.println("You are not  eligible");
	      	  }
	        }
	        for (int i = 1; i <=5; i++) {
	            for (int j = i; j < 5; j++) {
	                System.out.print(" ");
	            }
	            for (int k = 1; k <= (2 * i - 1); k++) {
	                System.out.print("*");
	                }
	            System.out.println(); 
	        }
	        int rows = 5; 

	        for (int i = 1; i <= rows; i++) {
	            for (int j = 1; j <= i; j++) {
	                System.out.print(j + " ");
	            }
	            System.out.println(); 
	            }
	       
	        char grade = 'B';

	        switch (grade) {
	            case 'A':
	                System.out.println("Excellent");
	                break;
	            case 'B':
	                System.out.println("Good");
	                break;
	            case 'C':
	                System.out.println("Average");
	                break;
	            case 'D':
	                System.out.println("Below Average");
	                break;
	            case 'F':
	                System.out.println("Fail");
	                break;
	            default:
	                System.out.println("Invalid grade");
	                
} }
}
