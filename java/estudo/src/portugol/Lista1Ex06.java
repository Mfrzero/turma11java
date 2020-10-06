package portugol;

import java.util.Scanner;

public class Lista1Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double x1, y1, x2, y2, distancia;

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite x1: ");
		x1 = sc.nextDouble();
		System.out.println("Digite y1: ");
		y1 = sc.nextDouble();
		System.out.println("Digite x2: ");
		x2 = sc.nextDouble();
		System.out.println("Digite y2: ");
		y2 = sc.nextDouble();
		distancia = Math.sqrt((Math.pow(x2 - x1, 2.0) + Math.pow(y2 - y1, 2.0)));	
		
		System.out.printf("A distancia entre os dois pontos é: %.5f", distancia);
		
		sc.close();
	}

}
