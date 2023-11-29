package entities;

public class PessoaFisica extends People {
	
	private Double gastoSaude;
	
	public PessoaFisica() {
		super();
	}
	
	public PessoaFisica(String name, Double salaryYear, Double gastoSaude) {
		super(name, salaryYear);
		this.gastoSaude = gastoSaude;
	}

	

	public Double getGastoSaude() {
		return gastoSaude;
	}

	public void setGastoSaude(Double gastoSaude) {
		this.gastoSaude = gastoSaude;
	}

	@Override
	public Double imposto() {
		if(super.getSalaryYear() < 20000) {
			if(gastoSaude>0) {
				return (super.getSalaryYear() * 0.25) - (gastoSaude * 0.50);
			}
			else {
				return (super.getSalaryYear() * 0.25);
			}
		}
		else {
			if(gastoSaude>0) {
				return (super.getSalaryYear() * 0.25) - (gastoSaude * 0.50);
			}
			else {
				return (super.getSalaryYear() * 0.25);
			}
		}
	}
	
	
}
