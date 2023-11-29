package Leonidas;

import java.util.Scanner;

public class aleatorio {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite quantos inimigos você acha que Leonidas vai batalhar");
        int palpite = teclado.nextInt();
        int numeroCorreto = 10000;
        while (palpite != numeroCorreto){
            System.out.println("Numero errado!");
            if (palpite < 100){
                System.out.println("Valor muito maior");
            }
                else if (palpite < 1000) {
                    System.out.println("Valor muito maior ainda!");
                    return;
                } else if (palpite < 8000) {
                    System.out.println("Maior ainda");
                    return;
                } else if (palpite > numeroCorreto) {
                    System.out.println("Menos!");
                    return;
                }
                System.out.println("Digite outro valor de quantos inimigos leonidas vai batalhar");
                palpite = teclado.nextInt();

        }
    }
}
