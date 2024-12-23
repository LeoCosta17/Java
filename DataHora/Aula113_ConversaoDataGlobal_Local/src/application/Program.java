package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Instant inst = Instant.now();
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println(inst);
		
		LocalDate dataLocal = LocalDate.ofInstant(inst, ZoneId.systemDefault());
		
		System.out.println(fmt.format(dataLocal));
		System.out.println("Dia: "+ dataLocal.getDayOfMonth());
		System.out.println("Mês: "+ dataLocal.getMonthValue());
		System.out.println("Ano: "+ dataLocal.getYear());
	}

}
