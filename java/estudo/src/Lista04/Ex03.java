package Lista04;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int[][] matriz = new int[3][3];
		int contMaior10 = 0;
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.println("Digite um n�mero");
				matriz[i][j] = sc.nextInt();
				if (matriz[i][j] > 10) {
					contMaior10++;
				}
			}
		}
		
		System.out.println("Foram digitados " + contMaior10 + " n�meros maiores de 10");
	
	sc.close();
	
	}

}
