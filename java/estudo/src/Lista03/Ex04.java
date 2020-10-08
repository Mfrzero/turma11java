package Lista03;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		char sexo = ' ', carac = ' ';
		int pessoas = 1, idade, contPessoaCalma = 0, contMulherNervosa = 0, contHomemAgressivo = 0, 
				outrosCalmos = 0, contNervosoAcima40 = 0, contCalmaMenor18 = 0;
		
		while(pessoas<=150) {
			
			System.out.println("Digite o sexo da " + pessoas + "° pessoa");
			System.out.println("1 - Feminino / 2 - Masculino / 3 - Outros");
			sexo = sc.next().charAt(0);
			System.out.println("Digite a idade da " + pessoas + "° pessoa");
			idade = sc.nextInt();
			System.out.println("Digite a caracteristica da " + pessoas + "° pessoa");
			System.out.println("1 - Calma / 2 - Nervosa / 3 - Agressiva");
			carac = sc.next().charAt(0);
			
			if(carac == '1') {
				contPessoaCalma++;
			}
			if(sexo == '1' && carac == '2') {
				contMulherNervosa++;
			}
			if(sexo == '2' && carac == '3') {
				contHomemAgressivo++;
			}
			if(sexo == '3' && carac == '1') {
				outrosCalmos++;
			}
			if(carac == '2' && idade > 40) {
				contNervosoAcima40++;
			}
			if(carac == '1' && idade < 18) {
				contCalmaMenor18++;
			}
			
			
			pessoas++;
		}
		
		System.out.println("\nNúmero de pessoas calmas: " + contPessoaCalma
						 + "\nNúmero de mulheres nervosas: " + contMulherNervosa
						 + "\nNúmero de homens agressivos: " + contHomemAgressivo
						 + "\nNúmero de outros calmos: " + outrosCalmos
						 + "\nNúmero de pessoas nervosas com mais de 40 anos: " + contNervosoAcima40
						 + "\nNúmero de pessoas calmas com menos de 18 anos: "+ contCalmaMenor18);
		sc.close();
		
	}

}
