package main.java.com.capg;

public class Parent {

	void method() throws InvalidAccountNumberException{
		
		System.out.println("start: method");
		
		throw new InvalidAccountNumberException();
		
	}
}


class child extends Parent{
	/*void method() throws InvalidAccountNumberException(){
		
		InsufficientFundsException insufficientFundsException=new InsufficientFundsException();
	    Exception exception=insufficientFundsException;
	    InvalidAccountNumberException invalidAccountException=new InvalidAccountNumberException(exception); 
		
		throw new  InvalidAccountNumberException();
		
		throw new InsufficientFundsException(); 
		
	}*/
}
 
