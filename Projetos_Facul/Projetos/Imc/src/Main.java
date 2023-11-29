import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite sua altura e peso");
        System.out.print("Altura: ");
        double altura = teclado.nextDouble();
        System.out.print("Peso: ");
        int peso = teclado.nextInt();
        double imc = peso / (altura * altura);
        System.out.printf("O seu Imc (Indice de massa corporal é de : %.2f)", imc);
    } 
}
