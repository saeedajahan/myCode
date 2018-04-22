package exception;

public class checkedException extends Exception {
	private int number1;
	private int number2;


	/*	
		Notes:
			1. User-defined exception must extend Exception class.
			2. The exception is thrown using throw keyword.*/
		public checkedException(int number1,int number2){
			super();
			number1=this.number1;
			number2=this.number2;	
		}
		//checked exception--- need to declare in method signature,,, nd main method 
		//can handle it by try--catch block---need to use throw keyword in main
		
		public static int getQuotient(int number1, int number2)throws Exception { //need to declare
			if(number2==0){
				throw new Exception("cant divide by zero----/00");//throw keyword to throw message error
			}
			return  (number1/number2);
			
		}
		public static void main(String[] args) throws Exception{ //need to declare in main
			//getQuotient(2,0);
		try{ //try-catch optional
				getQuotient(2,0);
			}
			catch(Exception e){
				System.out.println(e);
			}		
		}
		
	}




