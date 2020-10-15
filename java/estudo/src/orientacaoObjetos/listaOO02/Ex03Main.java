package orientacaoObjetos.listaOO02;

import java.util.Scanner;

public class Ex03Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		EmpregadoEx03 empregado = new EmpregadoEx03();
		
		System.out.println("Digite o codigo do setor do empregado: ");
		empregado.setCodigoSetor(sc.nextInt());
		System.out.println("Digite o nome do empregado: ");
		empregado.setNome(sc.next());
		System.out.println("Digite o salario base do empregado: ");
		empregado.setSalarioBase(sc.nextDouble());
		System.out.println("Digite o imposto sobre o salario base: ");
		empregado.setImposto(sc.nextDouble());
		
		System.out.println("Código do setor: " + empregado.getCodigoSetor()
						 + "\nNome do empregado: " + empregado.getNome()
						 + "\nSalario base: " + empregado.getSalarioBase()
						 + "\nImposto sobre o salario: " + empregado.getImposto() + "%"
						 + "\nSalario com os impostos: " + empregado.calculaSalario());
	}

}
