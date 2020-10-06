package portugol;

import java.util.Scanner;

public class Lista1Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a=0, b=0, c=0, d=0, e=0, f=0, x=0, y=0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor de A: ");
		a = sc.nextDouble();
		System.out.println("Digite o valor de B: ");
		b = sc.nextDouble();
		System.out.println("Digite o valor de C: ");
		c = sc.nextDouble();
		System.out.println("Digite o valor de D: ");
		d = sc.nextDouble();
		System.out.println("Digite o valor de E: ");
		e = sc.nextDouble();
		System.out.println("Digite o valor de F: ");
		f = sc.nextDouble();
		
		x = (c * e - b * f) / (a * e - b * d);
		y = (a * f - c * d) / (a * e - b * d);
		
		System.out.println("O valor de x é: " + x);
		System.out.println("O valor de y é: " + y);
		
		sc.close();

	}

}