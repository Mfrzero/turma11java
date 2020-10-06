programa
{
	//Revisa EX03
	funcao inicio()
	{
		inteiro numero = 0, contUm = 0,contDois = 0,contTres = 0,contQuatro = 0
		caracter opc = ' '

		faca{

			escreva("Digite um número: ")
			leia(numero)
			se(numero>=0 e numero<=25){
				contUm++
				}
			senao se(numero>=26 e numero<=50){
				contDois++
				}
			senao se(numero>=51 e numero<=75){
				contTres++
				}
			senao se(numero>=76 e numero<=100){
				contQuatro++
				}
			senao {
				escreva("\nNúmero negativo...")
				}
			escreva("\nDeseja inserir mais números? ")
			leia(opc)
			
		}enquanto(opc == 's' ou opc == 'S')
	
		escreva("\nForam digitados " + contUm + " Números entre 0 e 25"
			 + "\nForam digitados " + contDois + " Números entre 26 e 50"
			 + "\nForam digitados " + contTres + " Números entre 51 e 75"
			 + "\nForam digitados " + contQuatro + " Números entre 76 e 100")
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 826; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */