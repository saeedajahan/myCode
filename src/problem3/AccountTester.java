package problem3;

import java.util.ArrayList;
import java.util.Scanner;

public class AccountTester {

	public static void main(String[] args) {
		ArrayList<Transaction> list=new ArrayList<Transaction>();
		Scanner input=new Scanner(System.in);
		System.out.println("plz enter your id to get started");
		int id=input.nextInt();
		Account account=new Account(id,20000); //there should be hashmap to get stored balance by key
												//will update later
		System.out.println("plz enter the transaction type,"
				+ " d for deposite, w for withdrawn, o for account overview");
		
		String k=input.next();	
	
		switch(k.toLowerCase()){
			case "d":
			System.out.println("plz enter amount to deposite");
			double amount=input.nextDouble();
			double newBalance=account.deposite(amount);
			list.add(new Transaction('d',amount,newBalance,"deposite"));
			System.out.println(list);
			break;
			case "w":	
			System.out.println("plz enter amount to withdraw");
			amount=input.nextDouble();
			newBalance=account.withdraw(amount);
			list.add(new Transaction('w',amount,newBalance,"withdraw"));
			System.out.println(list);
			break;
			case "o":	
			System.out.println(account.toString());	
			break;
			case "default":
			System.out.println("wrong action");
			break;		
			
		} 
		input.close();

	}

}
