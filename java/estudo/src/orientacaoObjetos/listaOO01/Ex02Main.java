package orientacaoObjetos.listaOO01;

import java.util.Scanner;

public class Ex02Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		AviaoEx02 aviao = new AviaoEx02();
		
		System.out.println("Digite o nome do avi�o: ");
		aviao.nome = sc.next();
		System.out.println("Digite o tipo do avi�o: ");
		aviao.tipo = sc.next();
		System.out.println("Digite o tamanho do avi�o: ");
		aviao.tamanho = sc.nextDouble();
		System.out.println("Digite a velocidade do avi�o: ");
		aviao.velocidadeMaxima = sc.nextDouble();
		
		System.out.println("\nNome do avi�o: " + aviao.nome
						 + "\nTipo: " + aviao.tipo
						 + "\nTamanho: " + aviao.tamanho
						 + "\nVelocidade m�xima: " + aviao.velocidadeMaxima);
		
		aviao.ligarTurbinas();
		aviao.acelerar();
		aviao.decolar();
		aviao.voar();
		
		sc.close();
		
	}

}
