programa
{
	//Matriz EX02
	inclua biblioteca Util --> u
	
	funcao inicio()
	{
		const inteiro LIMITE = 5
		inteiro valorDado[LIMITE], media, soma = 0, maior = 0, totalMaior = 0

		escreva("Sorteando valores")
		para(inteiro i = 0; i < LIMITE; i++){
			valorDado[i] = u.sorteia(1,6)
			}
		para(inteiro i = 0; i< LIMITE; i++){
			escreva("\nO valor " + (i+1) + " foi " + valorDado[i])
			soma = soma + valorDado[i]
			se(valorDado[i] >= maior){
				maior = valorDado[i]
				totalMaior++
				}
			}

		media = soma / LIMITE
		escreva("\nA média dos lançamentos: " + media
		      + "\nVezes que o maior apareceu: " + totalMaior)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 468; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */