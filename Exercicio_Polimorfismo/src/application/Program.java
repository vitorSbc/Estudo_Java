package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entitie.Product;
import entitie.ProdutosImportados;
import entitie.ProdutosUsados;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Product> produtos = new ArrayList<Product>();

		System.out.print("Numero de produtos: ");
		Integer quantity = sc.nextInt();
		
		for(int i=0;i<quantity;i++) {
			
			System.out.printf("Produto n#%d data: ",i + 1);
			System.out.print("Usado, Comum ou Importado (u, c, i)? ");
			char resposta = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Preco: ");
			Double price = sc.nextDouble();
			if(resposta == 'u') {
				System.out.print("Data de fabricacao (DD/MM/YYYY): ");
				LocalDate data = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
				Product produto = new ProdutosUsados(name, price, data);
				produtos.add(produto);
			}
			else if(resposta == 'i') {
				System.out.print("Imposta da Alfandega: ");
				Double imposto = sc.nextDouble();
				Product produto = new ProdutosImportados(name, price, imposto);
				produtos.add(produto);
			}
			else if(resposta == 'c') {
				Product produto = new Product(name, price);
				produtos.add(produto);
			}
			else {
				System.out.println("Valor invalido");
			}
		}
		System.out.println("Eiqueta de preco: ");
		for(Product c : produtos) {
			System.out.println(c.priceTag());
		}
		
		sc.close();
	}

}
