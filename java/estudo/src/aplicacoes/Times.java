package aplicacoes;

import java.util.Scanner;

public class Times {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String[] times = {"Corinthians", "Santos", "Palmeiras", "São Paulo"};
		char resultado, opc;
		int rodada = 1;
		int[] pontos = new int[4];
		
		do {
			
			System.out.println(rodada + "° Rodada");
			
		for (int i = 0; i < times.length; i++) {
			System.out.println(times[i]);
			for (int j = 0; j < times.length; j++) {
				if(times[i] == times[j]) {
					System.out.println();
				}else {
				System.out.println(times[i] + " X " + times[j] + " = ");
				System.out.println("Qual o resultado? Ganhou - 1 / Perdeu - 2 / Empatou - 3");
				resultado = sc.next().charAt(0);
				if(resultado == '1') {
					pontos[i] += 3;
				}else if(resultado == '2') {
					pontos[i] += 0;
				}else if(resultado == '3') {
					pontos[i] += 1;
				}else {
					System.out.println("Inválido...");
				}
				
				}
			}
		}
		
		System.out.println("Deseja continuar para proxima rodada? ");
		opc = sc.next().charAt(0);
		rodada++;
		}while(opc == 's' || opc == 'S');
		
		for (int i = 0; i < times.length; i++) {
			System.out.println(times[i]);
			System.out.println("Total de pontos: " + pontos[i]);
		}
		
		sc.close();
	}

}
