package entities;

public final class ImportedProduct extends Product{
	private Double customsFree;
	
	public ImportedProduct() {
		super();
	}

	public ImportedProduct(String name, double price, double customsFree) {
		super(name, price);
		// TODO Auto-generated constructor stub
		this.customsFree = customsFree;
	}

	public Double getCustomsFree() {
		return customsFree;
	}

	public void setCustomsFree(Double customsFree) {
		this.customsFree = customsFree;
	}
	
	@Override
	public String toString() {
		return name + ", $" + String.format("%.2f", price) 
		+ " (Customs Free: $"+String.format("%.2f", customsFree) + ")";
	}
}
