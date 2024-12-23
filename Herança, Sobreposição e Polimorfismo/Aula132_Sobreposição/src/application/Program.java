package application;

import entities.Account;
import entities.BusinessAccount;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account_1 = new Account(1001, "Leonardo", 0.0);
		BusinessAccount bacc_1 = new BusinessAccount(1002, "Brenda", 0.0, 500.0);
		
		//UPCASTING
		
		Account account_2 = bacc_1;
		
		//DOWNCASTING
		
		bacc_1 = (BusinessAccount)account_2;
	}

}
