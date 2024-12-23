package entities;

public abstract class Contribuinte {
	protected String name;
	protected Double rendaAnual;
	
	protected Contribuinte() {
		
	}
	
	protected Contribuinte(String name, double rendaAnual) {
		this.name = name;
		this.rendaAnual = rendaAnual;
	}
	
	public abstract double imposto();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getRendaAnual() {
		return rendaAnual;
	}

	public void setRendaAnual(Double rendaAnual) {
		this.rendaAnual = rendaAnual;
	}

	@Override
	public String toString() {
		return name + ": " + String.format("%.2f", imposto()) ;
	}
	
}
