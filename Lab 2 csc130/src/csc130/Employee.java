package csc130;
import java.text.DateFormat;
import java.util.Date;
//Name- Kevin Perez
//Lab 2
//CSC130
//Description: This program mimics comparing and displaying employee salaries and information.
abstract public class Employee extends Person implements Comparable {

	private String employeeNo;
	Date dateHired = new Date();

	public Employee(){
		super();
		employeeNo = new String();
	}

	public Employee(String n, String ssno, String id, String gender){
		name = n;
		this.ssno = ssno;
		employeeNo = id;
		this.gender = gender;
	}

	public String getEmployeeNo() {
		return employeeNo;
	}

	public void setEmployeeNo(String employeeNo) {
		this.employeeNo = employeeNo;
	}

	public Date getDateHired() {
		return dateHired;
	}

	public void setDateHired(Date dateHired) {
		this.dateHired = dateHired;
	}

	public String toString(){
		return super.toString() + "\nEmployee no: " + employeeNo +  "\nHired on: " + DateFormat.getDateInstance().format(getDateHired());
	}
	public abstract double pay();
	public abstract void display();
}