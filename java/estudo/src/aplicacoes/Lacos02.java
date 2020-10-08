package aplicacoes;

import java.util.Scanner;

public class Lacos02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char opc = ' ';
		int x = 1;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Digite um numero: ");
			x = sc.nextInt();
			if(opc != 'n' || opc != 'N') {
				System.out.println(x);
			}
			System.out.println("Deseja continuar? Sim[S/s] ou Não[N/m]");
			opc = sc.next().charAt(0);
		}while(opc == 's' || opc == 'S');
	}

}
