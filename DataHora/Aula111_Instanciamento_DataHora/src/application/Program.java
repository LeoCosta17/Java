package application;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Instant;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate dataLocal = LocalDate.now();
		LocalDateTime dataHoraLocal = LocalDateTime.now();
		Instant instanteGlobal = Instant.now();
		
		System.out.println("Sem formatação:");
		System.out.println(dataLocal);
		System.out.println(dataHoraLocal);
		System.out.println(instanteGlobal);
		
		System.out.println("Com formatação:");	
		
		LocalDate dataLocalFormatada = LocalDate.parse("2003-09-12");
		LocalDateTime dataHoraLocalFormatada = LocalDateTime.parse("2014-07-27T10:34:58");
		Instant instanteFormatado = Instant.parse("2024-12-07T16:25:00-03:00");
		System.out.println(dataLocalFormatada);
		System.out.println(dataHoraLocalFormatada);
		System.out.println(instanteFormatado);
		
		System.out.println("Datas e horas customizadas:");
	}
}
