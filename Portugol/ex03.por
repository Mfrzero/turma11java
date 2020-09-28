programa
{
	inclua biblioteca Matematica --> mat
	 /*Ex03 - Faça um sistema que leia o tempo de 
	 duração de um evento em uma fábrica expressa em 
	 segundos e mostre-o expresso em horas, minutos e 
	 segundos*/
	funcao inicio()
	{
		inteiro segundos, horas, minutos, tempoDuracao
		
		escreva("Digite o tempo em segundos: ")
		leia(tempoDuracao)
		horas = tempoDuracao / 3600
		minutos = (tempoDuracao % 3600) / 60
		segundos = (tempoDuracao % 3600) % 60		
		
		escreva("Hora: " + horas
			 + "\nMinuto: " + minutos
			 + "\nSegundos: " + segundos)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 431; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */