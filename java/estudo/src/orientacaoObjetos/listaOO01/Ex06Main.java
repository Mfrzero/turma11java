package orientacaoObjetos.listaOO01;

import java.util.Scanner;

public class Ex06Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		ContaBancariaEx06 conta = new ContaBancariaEx06();
		
		System.out.println("Digite o nome do titular: ");
		conta.nomeDoTitular = sc.next();
		System.out.println("Digite o numero da conta: ");
		conta.numeroDaConta = sc.next();
		System.out.println("Digite a agencia: ");
		conta.agencia = sc.next();
		System.out.println("Digite o saldo da conta: ");
		conta.saldoBancario = sc.nextDouble();
		System.out.println("Digite a data de abertura da conta: ");
		conta.dataDeAbertura = sc.next();
		
		System.out.println("\nNome do titular: " + conta.nomeDoTitular
						 + "\nNumero da conta: " + conta.numeroDaConta
						 + "\nAgencia: " + conta.agencia
						 + "\nSaldo: " + conta.saldoBancario
						 + "\nData de abertura da conta: " + conta.dataDeAbertura);
	}

}























