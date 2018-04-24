package problem2;

import inheritance.MyDate;

public class Employee extends Person{
	private String office;
	private double salary;
	private MyDate dateHired=new MyDate();

	public Employee(String name) {	
		super(name);
			}
	
	public Employee(String name,String office,double salary,MyDate dateHired) {
		super(name);
		this.office=office;
		this.salary=salary;
		this.dateHired=dateHired;
			}

	public String getOffice() {
		return office;
	}

	public void setOffice(String office) {
		this.office = office;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public MyDate getDateHired() {
		return dateHired;
	}

	public void setDateHired(MyDate dateHired) {
		this.dateHired = dateHired;
	}

	@Override
	public String toString() {
		return "Employee [getName()=" + getName() + "]"+this.getClass().getName();
	}
	

}
