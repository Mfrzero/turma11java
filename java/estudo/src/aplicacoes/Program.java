package aplicacoes;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double recebe = 600;
		String nome; 
		char sexo, opcao;
		int anoNascimento, idade;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o nome: ");
		nome = sc.next();
		
		System.out.println("Digite a data de nascimento: ");
		anoNascimento = sc.nextInt();
		
		System.out.println("É chefe de familia: ");
		opcao = sc.next().charAt(0);
		
		idade = 2020 - anoNascimento;	
		
		if(idade >= 18 && opcao == 's' || opcao == 'S') {
			System.out.println("Digite o sexo M- Masculino F-Feminino");
			sexo = sc.next().charAt(0);
			if(sexo == 'M' || sexo == 'm') {
				System.out.println("\nNome: " + nome
								  +"\nIdade: " + idade
								  +"\nChefe de familia recebe R$"+ recebe);
			}
			else if(sexo == 'F' || sexo == 'f' ) {
				System.out.println("\nNome: " + nome
								  +"\nIdade: " + idade
								  +"\nMãe de familia recebe R$"+ recebe * 2);
			}
			else {
				System.out.println("Dados inválidos");
			}
		}
		else if(idade == 0 || idade < 18 ){
			System.out.println("Menor de idade não recebe...");
		}
		else {
			System.out.println("Dados inválidos");
		}

	}

}
