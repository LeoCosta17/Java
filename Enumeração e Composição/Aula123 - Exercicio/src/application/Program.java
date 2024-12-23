package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import entities.Worker;
import entities.Department;
import entities.HourContract;
import entities.enums.*;

public class Program {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Worker department: ");
		String department = sc.nextLine();
		System.out.println("Worker Data:");
		System.out.println("Name: ");
		String workerName = sc.nextLine();
		System.out.println("Level: ");
		String workerLevel = sc.nextLine();
		System.out.println("Base salary: ");
		double baseSalary = sc.nextDouble();
		
		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), 
				baseSalary, new Department(department));
		
		System.out.print("How many contracts to this worker? ");
		int contractsQtd = sc.nextInt();
		
		for(int i = 1; i <= contractsQtd; i++) {
			System.out.println("Contract #" + i + " data:");
			System.out.print("Date DD/MM/YYYY: ");
			Date contractDate = sdf.parse(sc.next());
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			System.out.print("Duration (hours): ");
			int hours = sc.nextInt();
			HourContract contract = new HourContract(contractDate, valuePerHour, hours);
			worker.addContract(contract);
		}
		
		System.out.print("Enter month and year to calculate income (MM/YYYY)");
		String monthYear = sc.next();
		int month = Integer.parseInt(monthYear.substring(0, 2));
		int year = Integer.parseInt(monthYear.substring(3));
		
		System.out.println("Worker Name: " + worker.getName());
		System.out.println("Worker Department: " + worker.getDeparment().getName());
		System.out.print("Income for " + monthYear + ": $" + String.format("%.2f", worker.income(year, month)));
		sc.close();
	}

}
