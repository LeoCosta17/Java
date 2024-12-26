package applcation;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Program {

	public static void main(String[] args) {
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		LocalDate dataLocal_1 = LocalDate.now();
		LocalDate dataLocal_2 = LocalDate.parse("2024-12-03");
		
		Duration duracao = Duration.between(dataLocal_1.atStartOfDay(), dataLocal_2.atStartOfDay());
		
		System.out.println(duracao.toDays());
	}

}
