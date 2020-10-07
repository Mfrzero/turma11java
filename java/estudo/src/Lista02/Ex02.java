package Lista02;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int[] numero = new int[3];
		int aux = -999999999;
		
		for (int i = 0; i < numero.length; i++) {
			System.out.println("Digite o " + i+ " número: ");
			numero[i] = sc.nextInt();
		}
		
		for (int i = 0; i < numero.length; i++) {
			for (int j = i + 1 ; j < numero.length; j++) {
				if(numero[i] > numero[j]) {
					aux = numero[i];
					numero[i] = numero[j];
					numero[j] = aux;
				}
			}	
		}
		for (int i = 0; i < numero.length; i++) {
			System.out.println(numero[i]);
		}
		
		sc.close();
	}
	
	

}
