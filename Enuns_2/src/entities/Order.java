package entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import entities.enums.OrderStatus;

public class Order {
	private Integer id;
	private LocalDateTime data;
	private OrderStatus status;
	
	public Order() {
		
	}
	
	public Order(Integer id, LocalDateTime data, OrderStatus status) {
		this.id = id;
		this.data = data;
		this.status = status;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Order Id=" + id + ", Data=" + data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")) + ", Status=" + status;
	}

	

	
}
