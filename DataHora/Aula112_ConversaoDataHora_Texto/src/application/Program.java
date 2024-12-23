package application;

import java.time.LocalDate;
import java.time.format.*;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate dataLocal = LocalDate.now();
		
		System.out.println(dataLocal.format(fmt));
	}

}
