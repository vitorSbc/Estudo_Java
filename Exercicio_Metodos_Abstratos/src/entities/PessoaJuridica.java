package entities;

public class PessoaJuridica extends People {

	private Integer numFuncionarios;
	
	public PessoaJuridica() {
		super();
	}
	
	
	public PessoaJuridica(String name, Double salaryYear, Integer numFuncionarios) {
		super(name, salaryYear);
		this.numFuncionarios = numFuncionarios;
	}

	

	public Integer getNumFuncionarios() {
		return numFuncionarios;
	}


	public void setNumFuncionarios(Integer numFuncionarios) {
		this.numFuncionarios = numFuncionarios;
	}


	@Override
	public Double imposto() {
		if(numFuncionarios > 10) {
			return super.getSalaryYear() * 0.14;
		}
		else {
			return super.getSalaryYear() * 0.16;
		}
	}

}
