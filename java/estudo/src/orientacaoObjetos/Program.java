package orientacaoObjetos;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		int ano = 2020;
		
		Scanner sc = new Scanner(System.in);
		String sexo = " ";
		String nota = " ";
		
		Professores professores = new Professores();
		Aluno aluno = new Aluno();
		
		System.out.println("Digite o nome do professor: ");
		professores.nome = sc.next();
		System.out.println("Digite a cidade do professor: ");
		professores.cidade = sc.next();
		System.out.println("Digite a idade do professor: ");
		professores.idade = sc.nextInt();
		System.out.println("Digite a especialidade do professor: ");
		professores.especialidade = sc.next();
		
		
		System.out.println("Nome: " + professores.nome
				 		 + "\nIdade: " + professores.idade
				 		 + "\nEspecialidade: " + professores.especialidade
				 		 + "\nCidade: " + professores.cidade);
		
		System.out.println("Digite o nome do Aluno: ");
		aluno.nome = sc.next();
		System.out.println("Digite o curso do aluno: ");
		aluno.curso = sc.next();
		System.out.println("Digite a cidade do aluno: ");
		aluno.cidade = sc.next();
		
		while(aluno.sexo != 'M' && aluno.sexo != 'm' && aluno.sexo != 'F' && aluno.sexo != 'f') {
			System.out.println("Digite o sexo do aluno: ");
			aluno.sexo = sc.next().charAt(0);
			if (aluno.sexo == 'M' || aluno.sexo == 'm') {
				sexo = "Masculino";
			} else if(aluno.sexo == 'F' || aluno.sexo == 'f') {
				sexo = "Feminino";
			}else {
				System.out.println("Invalido");
			}
		}
		System.out.println("Digite a nota do aluno: ");
		aluno.nota = sc.nextDouble();
			if (aluno.nota <= 5) {
				System.out.println("Reprovado");
			} else if(aluno.nota>5 && aluno.nota<=10) {
				System.out.println("Aprovado");
			}else {
				System.out.println("Invalido");
			}
		
		System.out.println("Digite a data de nascimento: ");
		aluno.anoNascimento = sc.nextInt();
		ano -= aluno.anoNascimento;
		
		System.out.println("Nome: " + aluno.nome
		 		 + "\nIdade: " + ano
		 		 + "\nCurso: " + aluno.curso
		 		 + "\nCidade: " + aluno.cidade);
		
		sc.close();
		
	}

}
