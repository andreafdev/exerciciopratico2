package exerciciopratico2;

import java.util.Scanner;

public class Lista1ex2 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numero;

        System.out.print("Digite um número: ");
        numero = scanner.nextDouble();

        if (numero % 2 == 0 && numero > 0) {
            System.out.println("O Número " + numero + " é par e positivo!");
        } else if (numero > 0) {
            System.out.println("O número é ímpar e positivo.");
        }

        if (numero % 2 == 0 && numero < 0) {
            System.out.println("O Número " + numero + " é par e negativo!");
        } else if(numero < 0){
            System.out.println("O número é ímpar e negativo.");
        }

	}
}
   