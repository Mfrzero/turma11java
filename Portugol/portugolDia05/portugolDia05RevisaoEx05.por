programa
{
	//REvisao EX05
	funcao inicio()
	{
		const inteiro X = 5
		real vetor[5]
		inteiro codigo = -1

		para(inteiro i=0; i < X; i++){
			escreva("Digite o " + (i + 1) + "° valor: ")
			leia(vetor[i])
		}

		escreva("Digite um codigo: ")
		leia(codigo)

		escolha(codigo){
			caso 0:
				pare 
			caso 1: 	
				para(inteiro i=0; i < X; i++){
					escreva("\nPosição: " + (i + 1) + ": " + vetor[i])
				}
				pare
			caso 2: 	
				para(inteiro i = X - 1; i >= 0; i--){
					escreva("\nPosição: " + (i + 1) + ": " +  vetor[i])
				}
				pare
			caso contrario: 	
				escreva("\nCódigo inválido...")
				pare			
			}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 298; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */