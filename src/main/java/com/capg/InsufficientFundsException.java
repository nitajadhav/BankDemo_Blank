package main.java.com.capg;

public class InsufficientFundsException extends Exception{

	String message;
	
	
	public String getMessage() {
		return message;
	}
	InsufficientFundsException(){
	}

	void InsufficientFundsException(String message)	{
		System.out.println("InsufficientFundsException occured "+message);
	}
}
