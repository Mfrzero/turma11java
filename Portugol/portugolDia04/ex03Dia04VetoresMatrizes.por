programa
{	
	
	//Matriz EX03
	funcao inicio()
	{
		const inteiro X = 2, Y = 2
		inteiro i, j, soma, n1[X][Y], n2[X][Y], m1[X][Y], m2[X][Y]
		
		para(i = 0; i < X; i++){
			para(j = 0; j < Y; j++){
				escreva("Digite um valor para a posição "+ i + " " + j +" da matriz N1: ")
				leia(n1[i][j])
				}
		}
		escreva("\n")
		para(i = 0; i < X; i++){
			para(j = 0; j < Y; j++){
				escreva("Digite um valor para a posição "+ i + " " + j +" da matriz N2: ")
				leia(n2[i][j])
				}
		}
		escreva("\n")
		para(i = 0; i < X; i++){
			para(j = 0; j < Y; j++){
				m1[i][j] = n1[i][j] + n2[i][j]
				m2[i][j] = n1[i][j] - n2[i][j]
				}
		}
		escreva("\n")
		para(i = 0; i < X; i++){
			para(j = 0; j < Y; j++){
				escreva("\nSoma dos valores da matriz "+ i + " " + j +" para matriz M1: " + m1[i][j])
				}
		}
		escreva("\n")
		para(i = 0; i < X; i++){
			para(j = 0; j < Y; j++){
				escreva("\nA diferença dos valores da matriz "+ i + " " + j +" para matriz M2: " + m2[i][j])
				}
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 51; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */