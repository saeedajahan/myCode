package palindrome;

import java.util.Scanner;

public class Palindrome {
	
	public static void main(String[] args){
		System.out.println("Plz enter number to check palindrome");
		Scanner m=new Scanner(System.in);
		int input=m.nextInt();
	int temp=reverse(input);
		if(input==temp){
			System.out.println("Given Number is Palindrome");
		}else{
			System.out.println("Not a Palindrome");
			
		}
	
		
	}
	public static int reverse(int input){
		int sum = 0,rem=0;
		while (input>0){
		
			rem=input%10;
			   sum=(sum*10)+rem;    
			   input=input/10;
			   
		}
		return sum;
}
}
