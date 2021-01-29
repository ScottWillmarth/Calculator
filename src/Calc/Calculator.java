package Calc;
import java.util.Scanner;

//Variables, data types, operators, type casting, control statements, 
// class, objects, access specifiers, and core keywords like final, this, and static

public class Calculator 
{
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
	    				System.out.println("What operation will you be using?");
	    			    System.out.println("addition, subtraction, multiplication, division");
	    			    operation = myScan.next();
	    			    checkOperator(operation);
	    		    }
	    	    }
		    }
	    }
	}

	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner myScan = new Scanner(System.in);
	    System.out.println("What operation will you be using?");
	    System.out.println("addition, subtraction, multiplication, division");

	    String operation = myScan.next();
	    checkOperator(operation);
	    
	    System.out.println(operation + "= ");
	    

	}

}