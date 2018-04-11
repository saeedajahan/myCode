package recursion;

import java.util.Scanner;

public class RecursiveSum {
public static void main(String[] args){
System.out.println("plz enter a positive number");
Scanner input=new Scanner(System.in);

	try{
		int n=input.nextInt();
		System.out.println("Sum using Recursion : "+sumR(n));
		System.out.println("Sum using For Loop : "+sumFor(n));
	}
	catch(Exception e) {
		System.out.println("Positve integer plz  : " + e);
		
	}
}

public static int sumR(int n){
	if (n==1){
		return 1;
	}
	
	else{
		return sumR(n-1)+n;
	}
}
	public static int sumFor(int n){
		int sum=0;
		for(int i=0;i<=n;i++){
			sum=sum+i;	
		}
		return sum;
	}
		
}


