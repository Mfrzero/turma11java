package Lista02;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int numero, raiz, quadrado;
		
		System.out.println("Digite um número: ");
		numero = sc.nextInt();
		
		if(numero > 0) {
			if(numero % 2 == 0) {
				raiz = (int) Math.sqrt(numero);
				System.out.println("Número positivo e par:" + numero);
				System.out.println("Raiz: " + raiz);
			}else {
				quadrado = (int) Math.pow(numero, 2);
				System.out.println("Número positivo e impar:" + numero);
				System.out.println("Quadrado: " + quadrado);
			}
			
		}
		else if(numero == 0) {
			System.out.println("Número nulo");
		}
		else {
			System.out.println("Número negativo");
		}
		
		sc.close();
	}

}
