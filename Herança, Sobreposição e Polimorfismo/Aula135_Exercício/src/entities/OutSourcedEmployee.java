package entities;

public final class OutSourcedEmployee extends Employee{
	private Double additionalCharge;
	
	public OutSourcedEmployee() {
		super();
	}

	public OutSourcedEmployee(String name, int hours, double valuePerHour, double additionalCharge) {
		super(name, hours, valuePerHour);
		this.additionalCharge = additionalCharge;
		// TODO Auto-generated constructor stub
	}

	public Double getAdditionalCharge() {
		return additionalCharge;
	}

	public void setAdditionalCharge(Double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}
	
	@Override
	public final double payment() {
		return hours * valuePerHour + (this.additionalCharge * 1.1);
	}
	
	@Override
	public String toString() {
		return name + " $"+ payment();
	}
}
