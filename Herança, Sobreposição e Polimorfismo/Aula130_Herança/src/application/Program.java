package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account_1 = new Account(1001, "Leonardo", 500.0);
		SavingsAccount sacc = new SavingsAccount(1002, "Leonardo", 500.00, 5.0);
		BusinessAccount bacc = new BusinessAccount(1003, "Brenda", 500.0, 300.00);
		
		account_1.withDraw(250.0);
		sacc.withDraw(250.0);
		bacc.withDraw(250.0);
		
		System.out.println(account_1.getBalance());
		System.out.println(sacc.getBalance());
		System.out.println(bacc.getBalance());
	}

}
