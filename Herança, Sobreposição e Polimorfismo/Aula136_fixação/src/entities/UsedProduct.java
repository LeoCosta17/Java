package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public final class UsedProduct extends Product{
	DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	private LocalDate manufactureDate;
	
	public UsedProduct() {
		super();
	}
	
	public UsedProduct(String name, double price, String date) {
		super(name, price);
		this.manufactureDate = LocalDate.parse(date, fmt);
	}

	public LocalDate getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(LocalDate manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	
	@Override
	public String toString() {
		return name + ", $" 
				+ String.format("%.2f", price) 
				+ " (Manufacture Date: "+ fmt.format(manufactureDate) + ")";
	}
}
