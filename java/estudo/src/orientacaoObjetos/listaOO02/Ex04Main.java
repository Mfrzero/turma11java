package orientacaoObjetos.listaOO02;

import java.util.Scanner;

public class Ex04Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		AdministradorEx04 adm = new AdministradorEx04();
		
		System.out.println("Digite o nome do administrador: ");
		adm.setNome(sc.next());
		System.out.println("Digite o numero de funcinarios que ele administra: ");
		adm.setNumeroDeFuncinarios(sc.nextInt());
		System.out.println("Digite a ajuda de custo: ");
		adm.setAjudaDeCusto(sc.nextDouble());
		
		System.out.println("\nNome do administrador: " + adm.getNome()
						 + "\nNumero de funcionarios que administra: " + adm.getNumeroDeFuncinarios()
						 + "\nAjuda de custo: R$" + adm.getAjudaDeCusto());
	}
}


