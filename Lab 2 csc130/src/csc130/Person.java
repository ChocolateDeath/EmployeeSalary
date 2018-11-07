package csc130;
//Name- Kevin Perez
//Lab 2
//CSC130
//Description: This program mimics comparing and displaying employee salaries and information.
class Person {
	// attributes will be inherited by child class
	protected String name;
	protected String ssno;
	protected String gender;

	// default constructor
	public Person() {
		name = "John Doe";
		ssno = "012345678";
		gender = "Male";
	}

	// overload the default constructor
	public Person(String name, String ssno, String gender) {
		this.name = name;
		this.ssno = ssno;
		this.gender = gender;
	}

	// return Person's name, ssno and gender
	public String toString() {
		return "Person: " + name + "\nSSNO: " + ssno + "\nGender: " + gender;
	}
	// add accessor methods
	public String getname(){
		return name;
	}
	public String getssno(){
		return ssno;
	}
	public String getgender(){
		return gender;
	}
	// add mutator methods
	public void setname(String n){
		name = n;	
	}
	public void setssno(String s){
		ssno = s;
	}
	public void setgender(String g){
		gender = g;
	}
}