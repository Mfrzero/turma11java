programa
{
	//Revisao EX06
	funcao inicio()
	{
		const inteiro X = 2, Y = 2
		inteiro vetor[X],matriz[X][Y], soma = 0, i, j
		
		para(i=0; i < X; i++){
			escreva("\nDigite o " + (i + 1) + "° valor para o vetor: ")
			leia(vetor[i])
		}
		para(i=0; i < X; i++){
			para(j=0; j < Y; j++){
			escreva("\nDigite o " + i + "." +  j + "° valor para a matriz: ")
			leia(matriz[i][j])
		}
		}
		para(i=0; i < X; i++){
			para(j=0; j < Y; j++){
			matriz[i][j] = vetor[i] * matriz[i][j]
		}
		}
		para(i=0; i < X; i++){
			para(j=0; j < Y; j++){
			escreva("\nValores multiplicados: " + matriz[i][j])
		}
		}		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 601; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */