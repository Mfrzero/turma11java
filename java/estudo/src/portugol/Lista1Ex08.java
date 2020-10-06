package portugol;

import java.util.Scanner;

public class Lista1Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double custoFabrica, valorFinal;

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o custo de fábrica do carro: ");
		custoFabrica = sc.nextDouble();
		
		valorFinal = (custoFabrica * 0.28) + (custoFabrica * 0.45);
		valorFinal = valorFinal + custoFabrica;
		System.out.printf("O custo ao consumidor de um carro é: %.2f", valorFinal);
		
		sc.close();
	}

}