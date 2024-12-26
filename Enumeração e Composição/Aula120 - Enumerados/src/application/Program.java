package application;

import entities.Pessoa;
import entities.enums.*;

public class Program {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa("Brenda", 24, 1.63, TipoPessoa.valueOf("FISICA"));
		
		System.out.print(pessoa);
	}

}
