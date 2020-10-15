package orientacaoObjetos.listaOO01;

import java.util.Scanner;

public class Ex07Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		PacienteEx07 paciente = new PacienteEx07();
		
		System.out.println("Digite o nome do paciente");
		paciente.nome = sc.next();
		System.out.println("Digite o sexo do paciente");
		paciente.sexo = sc.next();
		System.out.println("Digite a idade do paciente");
		paciente.idade = sc.nextInt();
		System.out.println("Digite a altura do paciente");
		paciente.altura = sc.nextDouble();
		System.out.println("Digite o peso do paciente");
		paciente.peso = sc.nextDouble();
		System.out.println("Digite as doenças pré-existentes do paciente");
		paciente.doencasExistentes = sc.next();
		System.out.println("Digite os sintomas do paciente");
		paciente.sintomas = sc.next();
		
		System.out.println("\nNome do paciente: " + paciente.nome 
						 + "\nIdade: " + paciente.idade
						 + "\nSexo: " + paciente.sexo
						 + "\nAltura: " + paciente.altura
						 + "\nPeso: " + paciente.peso
						 + "\nDoenças pré-existentes: " + paciente.doencasExistentes 
						 + "\nSintomas: " + paciente.sintomas);
		
		
		
	}

}



























