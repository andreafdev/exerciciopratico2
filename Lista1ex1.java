package exerciciopratico2;

import java.util.Scanner;

public class Lista1ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
        
        int a;
        int b;
        int c;
        int total;
        
        
        
        System.out.println("Digite o valor a: \n");
        a = entrada.nextInt();
        
        System.out.println("Digite o valor b: \n");
        b = entrada.nextInt();
        
        System.out.println("Digite o valor c: \n");
        c = entrada.nextInt();
    
        
        total = a + b;
        System.out.println("total: " + total);
        
        if(total >= c) {
            System.out.println("A Soma de A + B é Maior do que C");
        }
    }
	
}

