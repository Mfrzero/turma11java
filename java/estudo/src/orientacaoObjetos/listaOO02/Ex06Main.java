package orientacaoObjetos.listaOO02;

import java.util.Scanner;

public class Ex06Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		VendedorEx06 vendedor = new VendedorEx06();

		System.out.println("Digite o nome do vendedor: ");
		vendedor.setNome(sc.next());
		System.out.println("Digite o valor do produto vendido pelo vendedor: ");
		vendedor.setValorVendas(sc.nextDouble());
		System.out.println("Digite quantos produtos foram vendidos: ");
		vendedor.setQuantidadeVendida(sc.nextInt());
		System.out.println("Digite o salario do vendedor: ");
		vendedor.setSalario(sc.nextDouble());
		System.out.println("Digite a comissao que sera adicionado ao salario do vendedor: ");
		vendedor.setComissao(sc.nextDouble());
		
		System.out.println("\nNome do empregado: " + vendedor.getNome()
						 + "\nValor do item produzido: " + vendedor.getValorVendas()
						 + "\nDigite a a quantidade de produtos vendidos: " + vendedor.getQuantidadeVendida()
						 + "\nSalario: " + vendedor.getSalario()
						 + "\nComissao: " + vendedor.calculaComissao()
						 + "\nValor do salario final: " + vendedor.calculaTotal());	
	}

}
