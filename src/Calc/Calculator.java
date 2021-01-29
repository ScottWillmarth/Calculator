package Calc;
import java.util.Scanner;

public class Calculator 
{
	//This method carries out the calculation
	public static void calculate(String operation, double num1, double num2)
	{
		if(operation.equals("addition"))
	    {
	    	System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
	    }
	    else if(operation.equals("subtraction"))
	    {
	    	System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
	    }
	    else if(operation.equals("multiplication"))
	    {
	    	System.out.println(num1 + " * " + num2 + " = " + (num1*num2));
	    }
	    else if(operation.equals("division"))
	    {
	    	System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
	    }
	    else
	    {
	    	System.out.println("Error! Could not compute");
	    }
	}
	//This method verifies that the string is a valid operation
	public static void checkOperator(String operation)
	{
		if(!operation.equals("addition"))
	    {
	    	if(!operation.equals("subtraction"))
		    {
	    		if(!operation.equals("multiplication"))
	    	    {
	    			if(!operation.equals("division"))
	    		    {
	    				System.out.println("Please enter a valid operator, input is case sensitive");
	    				@SuppressWarnings("resource")
						Scanner myScan = new Scanner(System.in);
	    				System.out.println("What operation will you be using: ");
	    			    System.out.println("addition, subtraction, multiplication, division?");
	    			    operation = myScan.next();
	    			    checkOperator(operation);
	    		    }
	    	    }
		    }
	    }
	}

	//This is the main method where the program runs
	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner myScan = new Scanner(System.in);
		
		System.out.println("What operation will you be using: ");
	    System.out.println("addition, subtraction, multiplication, division?");
	    String operation = myScan.next();
	    
	    checkOperator(operation);
	    
	    System.out.println("Enter first number");
	    double num1 = myScan.nextDouble();
	    System.out.println("Enter second number");
	    double num2 = myScan.nextDouble();
	    
	    calculate(operation, num1, num2);
	    

	}

}