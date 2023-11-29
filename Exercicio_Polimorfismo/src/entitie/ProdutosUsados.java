package entitie;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ProdutosUsados extends Product{
	
	private LocalDate dataFabricacao;
	
	public ProdutosUsados() {
		super();
	}

	public ProdutosUsados(String name, Double price, LocalDate dataFabricacao) {
		super(name, price);
		this.dataFabricacao = dataFabricacao;
	}

	public LocalDate getDataFabricacao() {
		return dataFabricacao;
	}

	public void setDataFabricacao(LocalDate dataFabricacao) {
		this.dataFabricacao = dataFabricacao;
	}
	
	@Override
	public final String priceTag() {
		return super.getName() + " (used) $ " + super.getPrice() + " (Data de fabricacao: " + dataFabricacao.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + ")";
	}
}
