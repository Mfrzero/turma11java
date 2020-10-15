package orientacaoObjetos.listaOO01;

import java.util.Scanner;

public class Ex05Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		PatineteEx05 patinete = new PatineteEx05();
		
		System.out.println("Digite a cor do patinete: ");
		patinete.cor = sc.next();
		System.out.println("Digite o tipo do patinete(ferro/aluminio/madeira): ");
		patinete.tipo = sc.next();
		System.out.println("Digite a quantidade de rodas do patinete: ");
		patinete.quantidadeRodas = sc.nextInt();
		System.out.println("Digite a velocidade maxima do patinete: ");
		patinete.velocidadeMaxima = sc.nextDouble();
		
		System.out.println("\nCor do patinete: " + patinete.cor
						 + "\nTipo: " + patinete.tipo
						 + "\nQuantidade de rodas: " + patinete.quantidadeRodas
						 + "\nVelocidade maxima do patinete: " + patinete.velocidadeMaxima);

	}

}


























