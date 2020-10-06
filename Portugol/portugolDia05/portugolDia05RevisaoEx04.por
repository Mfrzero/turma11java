programa
{
	//Revisao EX04
	funcao inicio()
	{
		const inteiro X = 50

		inteiro soma = 0, cont = 0, soma2 = 0, somaTotal1 = 0, somaTotal2 = 0
		
		para(inteiro i=1; i <= X; i++){

			se(cont == 0){
				soma = soma + i
				soma2 = soma2 + i
				somaTotal1 = somaTotal1 + soma
				somaTotal2 = somaTotal2 + soma2
				cont++
				escreva("\n" + soma + "/" + soma2)
			}
			senao{
				soma = soma + 2
				soma2 = soma2 + 1
				somaTotal1 = somaTotal1 + soma
				somaTotal2 = somaTotal2 + soma2
				escreva("\n" + soma + "/" + soma2)
			}
		}
		escreva("\nSoma: " + somaTotal1 + "/" + somaTotal2)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 590; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */