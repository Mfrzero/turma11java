package orientacaoObjetos.listaOO01;

import java.util.Scanner;

public class Ex02Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		AviaoEx02 aviao = new AviaoEx02();
		
		System.out.println("Digite o nome do avião: ");
		aviao.nome = sc.next();
		System.out.println("Digite o tipo do avião: ");
		aviao.tipo = sc.next();
		System.out.println("Digite o tamanho do avião: ");
		aviao.tamanho = sc.nextDouble();
		System.out.println("Digite a velocidade do avião: ");
		aviao.velocidadeMaxima = sc.nextDouble();
		
		System.out.println("\nNome do avião: " + aviao.nome
						 + "\nTipo: " + aviao.tipo
						 + "\nTamanho: " + aviao.tamanho
						 + "\nVelocidade máxima: " + aviao.velocidadeMaxima);
		
		aviao.ligarTurbinas();
		aviao.acelerar();
		aviao.decolar();
		aviao.voar();
		
		sc.close();
		
	}

}
