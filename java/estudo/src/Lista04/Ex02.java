package Lista04;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int[] numero = new int[6];
		int[] par = new int[6];
		int[] impar = new int[6];
		int somaPar = 0, contImpar = 0;
		
		for (int i = 0; i < numero.length; i++) {
			System.out.println("Digite um número: ");
			numero[i] = sc.nextInt();
			if (numero[i] % 2 == 0) {
				somaPar += numero[i];
				par[i] = numero[i];
			} else {
				impar[i] = numero[i];
				contImpar++;
			}
		}
		
		for (int i = 0; i < numero.length; i++) {
			if (numero[i] % 2 == 0) {
				System.out.println("Numero Par: " + par[i]);
			} 
		}
		
		for (int i = 0; i < numero.length; i++) {
			if (numero[i] % 2 != 0) {
				System.out.println("Numero Impar: " + impar[i]);
			} 
		}
		
		System.out.println("Soma dos pares deu: " + somaPar);

		System.out.println("Foram digitados " + contImpar + " impares");
		
		sc.close();
	}

}
