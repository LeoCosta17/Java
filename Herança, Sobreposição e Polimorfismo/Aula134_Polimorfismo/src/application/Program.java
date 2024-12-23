package application;

import entities.Account;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// X e Y são do mesmo tipo, porém cada uma é um objeto de tipo específico diferente
		
		Account x = new Account(1101, "Leonardo", 500.0);
		Account y = new SavingsAccount(1102, "Brenda", 500.0, 0.5);
		
		x.withDraw(250.0);
		y.withDraw(250.0);
		
		System.out.println(x.getBalance());
		System.out.println(y.getBalance());
	}

}
