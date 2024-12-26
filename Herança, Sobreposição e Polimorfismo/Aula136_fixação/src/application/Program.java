package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Product product;
		List<Product> productList = new ArrayList<>();
		
		System.out.println("Enter the number of products:");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Product #" + i);
			System.out.println("Common, used or imported? c / u / i");
			char type = sc.next().charAt(0);
			
			System.out.println("Name:");
			String name = sc.next();
			
			System.out.println("Price:");
			double price = sc.nextDouble();
			
			switch (type) {
			case 'u':
				System.out.println("Manufacture date: dd/mm/yyyy");
				String manufactureDate = sc.next();
				product = new UsedProduct(name, price, manufactureDate);
				break;
			case 'i':
				System.out.println("Customs Free $:");
				double customsFree = sc.nextDouble();
				product = new ImportedProduct(name, price, customsFree);
				break;
			default:
				product = new Product(name, price);
				break;
			}
			
			productList.add(product);
		}
		
		for(Product prod : productList) {
			System.out.println(prod);
		}
		
		sc.close();
		
	}

}
