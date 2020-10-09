package Lista04;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] A = new int[6];
		int soma = 0;
		A[0] = 1; 
		A[1] = 0; 
		A[2] = 5; 
		A[3] = -2; 
		A[4] = -5; 
		A[5] = 7;
		
		soma = A[0] + A[1] + A[5];
		
		A[4] = 100;
		
		System.out.println("Valor da soma das posições 0, 1 e 5: " + soma);
		
		for (int i = 0; i < A.length; i++) {
			System.out.println("Vetor A posição " + i + "[" + A[i] + "]");
		}
		
		
		

	}

}
