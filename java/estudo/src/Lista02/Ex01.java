package Lista02;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numero = new int[3];
		int maior = -999999999;
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < numero.length; i++) {
			System.out.println("Digite o " + i+ " número: ");
			numero[i] = sc.nextInt();
			if(numero[i] > maior) {
				maior = numero[i];
			}
		}
		System.out.println("O maior número é: " + maior);
		
		sc.close();
	}

}
