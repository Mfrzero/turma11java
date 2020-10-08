package Lista03;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int numero, media = 0, cont = 0, soma = 0;
		
		do {
			
			System.out.println("Digite um número: ");
			numero = sc.nextInt();
			
			if(numero % 3 == 0) {
				soma += numero;
				cont++;
			}
			
		} while (numero != 0);
		
		media = soma / cont;
		
		System.out.println("A média deu: " + media);
		
		sc.close();

	}

}
