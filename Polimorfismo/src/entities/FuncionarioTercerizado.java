package entities;

public class FuncionarioTercerizado extends Employee{
	
	private Double despesaAdicional;
	
	public FuncionarioTercerizado() {
		super();
	}

	public FuncionarioTercerizado(String name, Integer hours, Double valuePerHour, Double despesaAdicional) {
		super(name, hours, valuePerHour);
		this.despesaAdicional = despesaAdicional;
	}
	
	
	public Double getDespesaAdicional() {
		return despesaAdicional;
	}

	public void setDespesaAdicional(Double despesaAdicional) {
		this.despesaAdicional = despesaAdicional;
	}

	@Override
	public Double payment() {
		return valuePerHour * hours + despesaAdicional + (despesaAdicional * 0.10); 
	}
	
	/*public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(name + " - $" + payment());
		return sb.toString();
	} */
}
