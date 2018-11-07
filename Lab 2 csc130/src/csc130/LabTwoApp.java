package csc130;
//Name- Kevin Perez
//Lab 2
//CSC130
//Description: This program mimics comparing and displaying employee salaries and information.
public class LabTwoApp {
	public static void main(String[]args){

		// #1
		SalariedEmployee Bob = new SalariedEmployee("Bob", "234569", "007", "Male", 1000000.90);
		HourlyEmployee Jessica = new HourlyEmployee("Jessica", "567890", "008", "Female", 2400, 17.50);

		// #2
		Bob.display();
		System.out.println();
		Jessica.display();

		// #3
		System.out.println();
		Employee theEmployee = Bob;

		// #4
		System.out.println();
		theEmployee.display();

		// #5
		System.out.println();
		System.out.println("Difference in salary: " + Bob.compareTo(Jessica));
	}

}
