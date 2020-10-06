package portugol;

import java.util.Scanner;

public class Lista1Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double a, b, c, d, r, s;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor de A: ");
		a = sc.nextDouble();
		System.out.println("Digite o valor de B: ");
		b = sc.nextDouble();
		System.out.println("Digite o valor de C: ");
		c = sc.nextDouble();
		r = a + b;
		s = b + c;
		d = (r + s) / 2;
		
		System.out.printf("Valor final: %.2f", d);
		
		sc.close();
	}

}
 