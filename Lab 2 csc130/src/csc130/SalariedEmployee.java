package csc130;
//Name- Kevin Perez
//Lab 2
//CSC130
//Description: This program mimics comparing and displaying employee salaries and information.
public class SalariedEmployee extends Employee {
	protected double salary;

	public SalariedEmployee(String n, String ssno, String id, String gender, double salary){
		super(n, ssno, id, gender);
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return super.toString() + "\nSalary: " + salary;
	}

	public double pay(){
		return salary;
	}

	public int compareTo(Object arg0){
		if (arg0 instanceof Employee)
			return (int)(this.pay() - ((Employee) arg0).pay());
		else
			throw new IllegalArgumentException();


	}
	public void display(){
		System.out.println(toString());
	}

}
