package application;

import java.util.Locale;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

import entities.Contribuinte;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Contribuinte contribuinte;
		List<Contribuinte> listaContribuintes = new ArrayList<>();

		System.out.println("Informe o número de contribuintes: ");
		int n = sc.nextInt();

		for(int i = 1; i <= n; i++){
			System.out.println("Contribuinte #" + i);
			System.out.println("Nome: ");
			String nome = sc.next();
			System.out.println("Renda anual: ");
			double rendaAnual = sc.nextDouble();
			System.out.println("Pessoa física (F) ou Juridica (J)?");
			char resp = sc.next().charAt(0);
			if(resp == 'F'){
				System.out.println("Informe gastos com saúde:");
				
			}else if(resp == 'J'){
				System.out.println("Informe a quantidade de funcionários: ");
			}
		}


		sc.close();
	}

}
