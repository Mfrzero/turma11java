programa
{
	//Matriz EX04
	/*Crie um programa que receba valores do usuário para 
	preencher uma matriz 3X3, e em seguida, exiba a soma 
	dos valores dela e a soma dos valores da primeira diagonal, 
	ou seja, diagonal principal.*/
	funcao inicio()
	{
		const inteiro X = 3, Y = 3
		
		inteiro i, j, matriz[X][Y], soma = 0, somaMatriz = 0
		
		para(i = 0; i < X; i++){
			para(j = 0; j < Y; j++){
				escreva("Digite um valor para a posição "+ i + " " + j +" da matriz: ")
				leia(matriz[i][j])
				somaMatriz = somaMatriz + matriz[i][j]
				}
		}

		escreva("\nA soma dos valores da matriz deu: " + somaMatriz)
		
		soma = matriz[0][0] + matriz[1][1] + matriz[2][2]

		escreva("\nA soma da diagonal deu: " + soma)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 400; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */