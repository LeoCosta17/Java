package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutSourcedEmployee;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Employee emp;
		List<Employee> employeeList = new ArrayList<>();
		
		System.out.println("Enter dthe number of employees: ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) { 
			System.out.println("Employee #"+i);
			System.out.println("Outsourced? S/N");
			char resp = sc.next().charAt(0);
			System.out.println("Name:");
			String name = sc.next();
			System.out.println("Hours:");
			int hours = sc.nextInt();
			System.out.println("Value per hour:");
			double valuePerHour = sc.nextDouble();
			if(resp == 'S') {
				System.out.println("Additional charge:");
				double addCharge = sc.nextDouble();
				emp = new OutSourcedEmployee(name, hours, valuePerHour, addCharge);
			}else {
				emp = new Employee(name, hours, valuePerHour);
			}
			employeeList.add(emp);
		}
		
		for(Employee obj : employeeList) {
			System.out.println(obj);
		}
		
		sc.close();
	}

}
