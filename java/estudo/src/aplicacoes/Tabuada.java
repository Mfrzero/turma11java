package aplicacoes;

//import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int soma;
		
		/*Scanner sc = new Scanner(Scanner.in);
		
		int numero;
		
		System.out.println("Digite o número que deseja fazer a tabuada: ");
		numero = sc.nextInt();*/
		//for(incializaçao; parada; incremento)
		
		for (int i = 1; i <= 10; i = i + 1) {
			System.out.println("Tabuada do " + i);
			System.out.println("-----------------");
			for (int j = 1; j <= 10; j++) {
				soma = i * j;
				System.out.println(i + " * " +  j + " = "+ soma);
			}
		}
		
	}
}
