package main.java.com.capg;

public class InvalidAccountNumberException extends Exception {

	String message;
	
	
	public String getMessage() {
		return message;
	}
	
	InvalidAccountNumberException()	{	
	}
	
		
	InvalidAccountNumberException(String message)
	{
		System.out.println("InvalidAccountNumberException occured "+message);
	}
	
	InvalidAccountNumberException(Exception e)
	{
		InvalidAccountNumberException InvalidAccountNumberException=new  InvalidAccountNumberException();
		InvalidAccountNumberException.message=e.getMessage();
		System.out.println("Exception casted to InsufficintFundsException");
	}
	
	
}
