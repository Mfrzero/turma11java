package Lista03;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int soma = 0, numero;
		
		do {
			System.out.println("Digite um número: ");
			numero = sc.nextInt();
			
			soma += numero;
			
		} while (numero != 0);
		
		System.out.println("A soma deu: " + soma);
		
		sc.close();
	}

}
