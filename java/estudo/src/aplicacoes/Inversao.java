package aplicacoes;

import java.util.Scanner;

public class Inversao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		
		System.out.println("Escreva o primeiro numero: ");
		a = sc.nextInt();
		System.out.println("Escreva o segundo numero: ");
		b = sc.nextInt();
		
		System.out.println("Valores antes da inversão a: " + a + " b: " + b );
				
//		x = x + y 
//		y = x - y 
//		x = x - y
		
		System.out.println("Valores apos a inversão a: " + a + " b: " + b );

		
		sc.close();
	}

}
