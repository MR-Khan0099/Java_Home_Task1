package Exceptions;

import java.util.Scanner;


public class reservation {
	
	
	public void book_time() 
	{
	     try (Scanner scanner = new Scanner(System.in)) {
	            System.out.println("Please enter reservation in 24 hours form ");
	            
	            System.out.print("Enter booking time: ");
	            int booktime = scanner.nextInt();

	            // Code that may throw exceptions
	             checktime(booktime);
	            
	        } catch (ArithmeticException | NullPointerException e) {
	            // Handle specific exceptions and rethrow
	            System.out.println("An error occurred. Error: " + e.getMessage());
	            throw e; // Rethrow the exception
	        } 
	}
	 public void checktime(int booktime) {
		 int x=5;
		 if(booktime>4 && booktime<20) 
		 {
			 // do nothing
		 }
		 else {
		 try {
	            // Method that may throw ArithmeticException
	        	 x=5/0;
	           
	            
	        } catch (ArithmeticException e) {
	            // Wrap the original exception in a new exception and throw it
	            throw new RuntimeException("Error during booking", e);
	        }
	    } 
}
}