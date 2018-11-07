package csc130;
//Name- Kevin Perez
//Lab 2
//CSC130
//Description: This program mimics comparing and displaying employee salaries and information.
public class HourlyEmployee extends Employee {
	protected double hours;
	protected double rate;

	public HourlyEmployee(String n, String ssno, String id, String gender, double hrs, double rate){
		super(n, ssno, id, gender);
		hours = hrs;
		this.rate = rate;
	}

	public double getHours() {
		return hours;
	}

	public void setHours(double hours) {
		this.hours = hours;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}
	public String toString(){
		return super.toString() + "\nhours: " + hours + "\nrate: " + rate;
	}
	public double pay(){
		return (hours * rate);
	}
	public void display(){
		System.out.println(toString());
	}
	public int compareTo(Object arg0){
		if (arg0 instanceof Employee)
			return (int)(this.pay() - ((Employee) arg0).pay());
		else
			throw new IllegalArgumentException();
	}
}
