package entities;

public abstract class People {
	
	private String name;
	private Double salaryYear;
	
	public People() {
		
	}

	public People(String name, Double salaryYear) {
		this.name = name;
		this.salaryYear = salaryYear;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalaryYear() {
		return salaryYear;
	}

	public void setSalaryYear(Double salaryYear) {
		this.salaryYear = salaryYear;
	}
	
	public abstract Double imposto();
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(name + ": $ " + String.format("%.2f", imposto()));
		return sb.toString();
	}
}
