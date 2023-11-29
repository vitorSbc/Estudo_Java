package entitie;

public class ProdutosImportados extends Product {
	
	private Double taxaAlfandega;
	
	public ProdutosImportados() {
		super();
	}

	public ProdutosImportados(String name, Double price, Double taxaAlfandega) {
		super(name, price);
		this.taxaAlfandega = taxaAlfandega;
	}

	public Double getTaxaAlfandega() {
		return taxaAlfandega;
	}

	public void setTaxaAlfandega(Double taxaAlfandega) {
		this.taxaAlfandega = taxaAlfandega;
	}
	
	@Override
	public final String priceTag() {
		return super.getName() + " $ " + String.format("%.2f", totalPrice()) + " (Impostos: $ " + String.format("%.2f", taxaAlfandega) + ")";
	}
	
	public Double totalPrice() {
		return super.getPrice() + taxaAlfandega;
	}
}
