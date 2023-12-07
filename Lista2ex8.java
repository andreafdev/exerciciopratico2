package exerciciopratico2;

import java.util.Scanner;

public class Lista2ex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float saldo = 1000;
        float saque;
        float deposito;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Escolha um número entre 1 a 4");

        int numero = entrada.nextInt();
        
        switch (numero) {
        case 1:
            System.out.println("O seu saldo é de: " + saldo);

            break;

        case 2:
            
            System.out.println("Valor de saque: ");
            saque = entrada.nextFloat();
            
            if(saldo >= saque) {
                System.out.println(saque - saldo);
            } else{
                System.out.println("Seu saldo é insuficiente! ");
            }

            break;

        case 3:
            System.out.println("Digitar o valor do deposito: ");
            deposito = entrada.nextFloat();

            System.out.println("O seu saldo atual é: " + deposito +  saldo);

            break;

        default:
            System.out.println("A opcao é invalida!");
        }
	}

}
