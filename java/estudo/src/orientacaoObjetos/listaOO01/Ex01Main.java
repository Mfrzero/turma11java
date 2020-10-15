package orientacaoObjetos.listaOO01;

import java.util.Scanner;

public class Ex01Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		ClienteEx01 cliente = new ClienteEx01();
		
		System.out.println("Digite o nome do cliente: ");
		cliente.nome = sc.next();
		System.out.println("Digite a idade do cliente: ");
		cliente.idade = sc.nextInt();
		System.out.println("Digite o cargo do cliente: ");
		cliente.cargo = sc.next();
		System.out.println("Digite o salário do cliente: ");
		cliente.salario = sc.nextDouble();
		
		System.out.println("\nNome: " + cliente.nome
						 + "\nIdade: " + cliente.idade
						 + "\nCargo: " + cliente.cargo
						 + "znSalario: " + cliente.salario);
		
		cliente.apresenta();
		
		sc.close();
	}
	
}
