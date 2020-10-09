package aplicacoes;

import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		double[] notas = new double[3];
		int[] codigo = new int[3];
		String[] nome = new String[3];
		char opc = ' ';
		
		
		do{
		for (int i = 0; i < nome.length; i++) {
			
			System.out.println("Digite o nome do colega: ");
			nome[i] = sc.next();
			codigo[i] = i;
			for (int j = 0; j < 1; j++) {
				System.out.println("Digite a nota: ");
				notas[i] = sc.nextDouble();
			}
		}
		System.out.println("Deseja continuar? [S/s] [N/n]");
		opc = sc.next().charAt(0);
		
	}while(opc == 'S' || opc == 's');
		
		for (int i = 0; i < nome.length; i++) {
			System.out.println("Id: " + codigo[i] + " nome " + nome[i] + " nota: " + notas[i]);
		}
	}

}
