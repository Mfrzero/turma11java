package orientacaoObjetos.listaOO02;

import java.util.Scanner;

public class Ex05Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		OperarioEx05 operario = new OperarioEx05();

		System.out.println("Digite o nome do operario: ");
		operario.setNome(sc.next());
		System.out.println("Digite o valor do produto produzido pelo operario ");
		operario.setValorProducao(sc.nextDouble());
		System.out.println("Digite a quantidade de produtos vendidos");
		operario.setQuantidadeVendida(sc.nextInt());
		System.out.println("Digite o salario do operario ");
		operario.setSalario(sc.nextDouble());
		System.out.println("Digite a comissao que sera adicionado ao salario do operario: ");
		operario.setComissao(sc.nextDouble());
		
		System.out.println("\nNome do empregado: " + operario.getNome()
						 + "\nValor do item produzido: " + operario.getValorProducao()
						 + "\nQuantidade de itens vendidos: " + operario.getQuantidadeVendida()
						 + "\nSalario: " + operario.getSalario()
						 + "\nComissao: " + operario.calculaComissao()
						 + "\nValor do salario final: " +operario.calculaTotal());
	}

}
