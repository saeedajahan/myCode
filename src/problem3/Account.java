package problem3;

import java.util.Date;
//import problem3.Transaction;

public class Account {
	private int id;
	private double balance;
	private double annualInterestRate=4.5;
	private Date dateCreated=new Date();
	private String customer;
	public Transaction transaction;

	
	
	public Account(){
		
	}
	public Account(int id,double balance){
		this.id=id;
		this.balance=balance;
		this.transaction=new Transaction();
	}
	public Account(String customer,int id,double balance){
		this.customer=customer;
		this.id=id;
		this.balance=balance;
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	public Date getDateCreated() {
		return dateCreated;
	}
	
	
	public String getCustomer() {
		return customer;
	}
	public void setCustomer(String customer) {
		this.customer = customer;
	}
	public double getMonthlyInterestRate() {
		return annualInterestRate/12;
	}
	public double getMonthlyInterest() {
		return (getMonthlyInterestRate()*balance)/100;
	}
	public double withdraw(double withdrawn) {
		return balance=balance-withdrawn;
	}
	public double deposite(double deposite) {
		return balance=balance+deposite;
	}
	@Override
	public String toString() {
		return "Account [balance=" + balance + ", dateCreated=" + dateCreated + ", MonthlyInterest()="
				+ getMonthlyInterest() + "]";
	}
}
