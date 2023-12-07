package exerciciopratico2;

import java.util.Scanner;

public class Lista2ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float num1;
        float num2;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Escolha um número entre 1 a 4");

        int numero = entrada.nextInt();
        
        switch (numero) {
        case 1:
            System.out.println("Digite primeiro numero: ");
            num1 = entrada.nextFloat();

            System.out.println("Digite o segundo numero: ");
            num2 = entrada.nextFloat();

            System.out.println(num1 + num2);

            break;

        case 2:
            System.out.println("Digite primeiro numero: ");
            num1 = entrada.nextFloat();

            System.out.println("Digite o segundo numero: ");
            num2 = entrada.nextFloat();

            System.out.println(num1 - num2);

            break;

        case 3:
            System.out.println("Digite primeiro numero: ");
            num1 = entrada.nextFloat();

            System.out.println("Digite o segundo numero: ");
            num2 = entrada.nextFloat();

            System.out.println(num1 * num2);

            break;

        case 4:
            System.out.println("Digite primeiro numero: ");
            num1 = entrada.nextFloat();

            System.out.println("Digite o segundo numero: ");
            num2 = entrada.nextFloat();
            
            System.out.println(num1 / num2);
            
            break;

        default:
            System.out.println("A opcao é invalida!");
        }
	}

}
