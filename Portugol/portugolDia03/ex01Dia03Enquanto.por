programa
{
	//Enquanto EX01
	funcao inicio()
	{
		inteiro numero = 0, soma = 0, media, total = 0

		
		enquanto(numero >= 0){
		escreva("Digite um numero: ")
		leia(numero)
			se(numero > 0){
				soma = soma + numero
				total = total + 1
			}
			senao se(numero == 0){
				escreva("0 não soma\n")
				}
			senao{
				escreva("Negativo...")
				}
		
		}
		se(soma > 0){
		media = soma / total

		escreva("\nSoma dos números: " + soma
			 + "\nMédia: " + media
			 + "\nTotal de números positivos digitados: " + total)
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 295; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */