package Lista03;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int idade = 0, contMenor21 = 0, contMaior50 = 0, i = 1;
		
		while(idade != -99) {
			
			System.out.println("Digite a idade da " + i + "° pessoa");
			idade = sc.nextInt();
			i++;
			if(idade >= 0 && idade < 21) {
				contMenor21++;
			}else if(idade > 50) {
				contMaior50++;
			}
		}
		System.out.println("Quantidade de pessoas menores de 21 anos: " + contMenor21
						 + "\nQuantidade de pessoas maiores de 50 anos: " + contMaior50);
		
		sc.close();

	}

}
