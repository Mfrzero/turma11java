package Lista02;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int idade;
		
		System.out.println("Digite a idade da pessoa: ");
		idade = sc.nextInt();
		
		if (idade>= 10 && idade <= 14) {
			System.out.println("Infantil");
		}
		else if (idade >= 15 && idade <= 17) {
			System.out.println("Juvenil");
		}
		else if (idade >= 18 && idade <= 25) {
			System.out.println("Adulto");
		}
		else {
			System.out.println("Dados inválidos...");
		}
		
		sc.close();
	}

}
