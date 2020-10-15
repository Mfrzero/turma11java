package orientacaoObjetos.listaOO01;

import java.util.Scanner;

public class Ex04Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		FuncionarioEx04 funcionario = new FuncionarioEx04();
		
		System.out.println("Digite o id do funcionario: ");
		funcionario.id = sc.nextInt();
		System.out.println("Digite o nome do funcionario: ");
		funcionario.nome = sc.next();
		System.out.println("Digite a idade do funcionario: ");
		funcionario.idade = sc.nextInt();
		System.out.println("Digite o telefone do funcionario: ");
		funcionario.telefone = sc.next();
		System.out.println("Digite o cargo do funcionario: ");
		funcionario.cargo = sc.next();
		System.out.println("Digite o salario do funcionario: ");
		funcionario.salario = sc.nextDouble();
		
		System.out.println("\nID: " + funcionario.id
						 + "\nNome: " + funcionario.nome
					 	 + "\nIdade: " + funcionario.idade
						 + "\nTelefone: " + funcionario.telefone
					 	 + "\nCargo: " + funcionario.cargo
						 + "\nSalario: " + funcionario.salario);

	}

}
















































