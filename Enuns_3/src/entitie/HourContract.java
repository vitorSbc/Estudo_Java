package entitie;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class HourContract {
	DateTimeFormatter fm = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	private LocalDate date;
	private Double valuePerHour;
	private Integer hours;
	
	public HourContract() {
		
	}

	public HourContract(LocalDate date, Double valuePerHour, Integer hours) {
		this.date = date;
		this.valuePerHour = valuePerHour;
		this.hours = hours;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Double getValuePerHour() {
		return valuePerHour;
	}

	public void setValuePerHour(Double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}

	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}
	
	public Double totalValue() {
		return valuePerHour * hours;
	}

	@Override
	public String toString() {
		return "HourContract [date=" + date.format(fm) + ", valuePerHour=" + valuePerHour + ", hours=" + hours + "]";
	}
	
}

