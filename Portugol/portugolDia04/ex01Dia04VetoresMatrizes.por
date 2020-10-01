programa
{
	//Vetor EX01
	funcao inicio()
	{	
		const inteiro X = 5
		inteiro pontos[X], maior = 0

		para(inteiro i = 0; i < X; i++){
			escreva("Digite a "+ (i+1) + "* pontuação: ")
			leia(pontos[i])

			se(pontos[i] > maior){
				maior = pontos[i]
				}
			}
		escreva("A maior pontuação foi: " + maior)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 126; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */