package aplicacoes;

import java.util.Scanner;

public class Lacos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int numero;
		char opc = ' ';
		
		for (int i = 1; i <= 1000; i++) {
			System.out.println("Digite um numero: ");
			numero = sc.nextInt();
			System.out.println("Deseja continuar?");
			opc = sc.next().charAt(0);
			
			if(opc == 's' || opc == 'S') {
				System.out.println("Digite outro numero: ");
				numero = sc.nextInt();
			}else {
				break;
			}
		}
		
//		while(x <=1000) {
//			System.out.println(x + " ");
//			x++;
//		}
	}

}
