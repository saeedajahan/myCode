package exception;

public class UserDefinedException extends RuntimeException{
private int number1;
private int number2;


/*	
	Notes:
		1. User-defined exception must extend Exception class.
		2. The exception is thrown using throw keyword.*/
	public UserDefinedException(int number1,int number2){
		super();
		number1=this.number1;
		number2=this.number2;	
	}
	//Un-checked exception---no need to declare in method signature,,, nd main method 
	//can handle it by try--catch block---no need to use throw keyword in main
	
	public static int getQuotient(int number1, int number2){
		if(number2==0){
			throw new RuntimeException("cant divide by zero----/00");//throw keyword to throw message error
		}
		return  (number1/number2);
		
	}
	public static void main(String[] args){
		try{
			getQuotient(2,0);
		}
		catch(RuntimeException e){
			System.out.println(e);
		}		
	}

}
