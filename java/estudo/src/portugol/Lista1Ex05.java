package portugol;

import java.util.Scanner;

public class Lista1Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double nota1, nota2, nota3, media;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
		nota1 = sc.nextDouble();
		System.out.println("Digite a segunda nota: ");
		nota2 = sc.nextDouble();
		System.out.println("Digite a terceira nota: ");
		nota3 = sc.nextDouble();
		media = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) / 10; 
		System.out.printf("A nota final é : %2f", media);
		
		sc.close();
	}

}