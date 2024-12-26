package entities;

public class PessoaJuridica extends Contribuinte{

	private Integer numFuncionarios;
	
	public PessoaJuridica() {
		super();
	}
	
	public PessoaJuridica(String name, double rendaAnual, int numFuncionarios) {
		super(name, rendaAnual);
		this.numFuncionarios = numFuncionarios;
	}

	public Integer getNumFuncionarios() {
		return numFuncionarios;
	}

	public void setNumFuncionarios(Integer numFuncionarios) {
		this.numFuncionarios = numFuncionarios;
	}
	
		@Override
	public double imposto() {
		double imposto;
		if(this.numFuncionarios <= 10){
			imposto = (this.rendaAnual / 100) * 16;	
		}else{
			imposto = (this.rendaAnual / 100) * 14;
		}
		return imposto;
	}

}
