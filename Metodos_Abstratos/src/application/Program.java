package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entitie.Circle;
import entitie.Rectangle;
import entitie.Shape;
import entitie_enums.Color;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Shape> lista = new ArrayList<Shape>();
		
		System.out.print("Digite o numero de formas: ");
		Integer value = sc.nextInt();
		for(int i = 0; i<value ; i++) {
			System.out.printf("Forma #%d data: \n",i+1);
			System.out.print("Retangulo ou Circulo (r/c)? ");
			char resposta = sc.next().charAt(0);
			System.out.print("Cor (BLACK/BLUE/RED): ");
			Color cor = Color.valueOf(sc.next());
			if(resposta == 'r') {
				System.out.print("Largura: ");
				Double largura = sc.nextDouble();
				System.out.print("Altura: ");
				Double altura = sc.nextDouble();
				lista.add(new Rectangle(cor, largura, altura));
			}
			else {
				System.out.print("Raio: ");
				Double raio = sc.nextDouble();
				lista.add(new Circle(cor, raio));
			}
		}
		System.out.println("Area das formas: ");
		for(Shape c : lista) {
			System.out.printf("%.2f\n",c.area());
		}
		
		
		sc.close();
	}

}
