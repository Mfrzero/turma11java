package Lista04;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int X = 2, Y = 2;
		Scanner sc = new Scanner(System.in);
		
		int[][] matriz1 = new int[2][2];
		int[][] matriz2 = new int[2][2];
		char opc = ' ';
		int soma1 = 0 , soma2 = 0, total = 0, subtrai1 = 0, subtrai2 = 0;
		
		for (int i = 0; i < matriz1.length; i++) {
			for (int j = 0; j < matriz1.length; j++) {
				System.out.println("Digite um número para matriz 1 : ");
				matriz1[i][j] = sc.nextInt();
				soma1 += matriz1[i][j];
				subtrai1 +=  matriz1[i][j];
			}
		}
		
		for (int i = 0; i < matriz2.length; i++) {
			for (int j = 0; j < matriz2.length; j++) {
				System.out.println("Digite um número para matriz 2 : ");
				matriz2[i][j] = sc.nextInt();
				soma2 += matriz2[i][j];
				subtrai2 +=  matriz2[i][j];
			}
		}
		
		System.out.println("      Escolha uma opção");
		System.out.println("-----------------------------------");
		System.out.println("1 - Somar as duas materizes");
		System.out.println("2 - Subtrair as duas matrizes");
		System.out.println("3 - Adicionar uma constante as duas matrizes");
		System.out.println("4 - Imprimir as matrizes");
		
		opc = sc.next().charAt(0);
		
		switch (opc) {
		case '1': {
			total = soma1 + soma2;	
			System.out.println("Soma das matrizes: " + total);
			break;
		}
		case '2': {
			total = subtrai1 - subtrai2;	
			System.out.println("Subtração das matrizes: " + total);
			break;
				}
		case '3': {
			for (int i = 0; i < X; i++) {
				for (int j = 0; j < Y; j++) {
					System.out.println("Matriz 1 ["+i+"]["+j+"]: "  + matriz1[i][j]);
				}
			}
			
			for (int i = 0; i < X; i++) {
				for (int j = 0; j < Y; j++) {
					System.out.println("Matriz 2 ["+i+"]["+j+"]: "  + matriz2[i][j]);
				}
			}
		}
		case '4': {
			for (int i = 0; i < matriz1.length; i++) {
				for (int j = 0; j < matriz1.length; j++) {
					System.out.println("Matriz 1 ["+i+"]["+j+"]: "  + matriz1[i][j]);
				}
			}
			
			for (int i = 0; i < matriz2.length; i++) {
				for (int j = 0; j < matriz2.length; j++) {
					System.out.println("Matriz 2 ["+i+"]["+j+"]: "  + matriz2[i][j]);
				}
			}
			break;
		}
		default:
			System.out.println("Valor inválido");
		}
		
		sc.close();
	}

}
