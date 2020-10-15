package orientacaoObjetos.listaOO02;

import java.util.Scanner;

public class Ex02Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		FornecedorEx02 fornecedor = new FornecedorEx02();
		
		System.out.println("Digite o nome do fornecedor: ");
		fornecedor.setNome(sc.next());
		System.out.println("Digite o endereço do fornecedor: ");
		fornecedor.setEndereco(sc.next());
		System.out.println("Digite o telefone do fornecedor: ");
		fornecedor.setTelefone(sc.next());
		System.out.println("Digite o valor de credito com o fornecedor: ");
		fornecedor.setValorCredito(sc.nextDouble());
		System.out.println("Digite o valor da divida com o fornecedor");
		fornecedor.setValorDivida(sc.nextDouble());
		
		System.out.println("Nome do fornecedor: " + fornecedor.getNome()
						 + "\nEndereço: " + fornecedor.getEndereco()
						 + "\nTelefone: " + fornecedor.getTelefone()
						 + "\nValor de credito: " + fornecedor.getValorCredito()
						 + "\nValor da divida: " + fornecedor.getValorDivida());
		System.out.println("Saldo com o fornecedor: " + fornecedor.obterSaldo());
	}

}
