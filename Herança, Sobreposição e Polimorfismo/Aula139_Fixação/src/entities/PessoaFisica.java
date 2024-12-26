package entities;

public class PessoaFisica extends Contribuinte{
	private double gastoSaude;
	
	public PessoaFisica() {
		super();
	}

	public PessoaFisica(String name, double rendaAnual, double gastoSaude) {
		super(name, rendaAnual);
		this.gastoSaude = gastoSaude;
	}

	public double getGastoSaude() {
		return gastoSaude;
	}

	public void setGastoSaude(double gastoSaude) {
		this.gastoSaude = gastoSaude;
	}

	@Override
	public double imposto() {
		double imposto = (rendaAnual <= 20000.0) ? ((this.rendaAnual / 100) * 15) : ((this.rendaAnual / 100) * 25);
		if (this.gastoSaude > 0) {
			imposto -= (this.gastoSaude / 2.0);
		}
		return imposto;
	}
	
	
}
