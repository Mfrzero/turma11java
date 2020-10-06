programa
{
	//Revisao EX02
	funcao inicio()
	{
		real peso = 0, altura = 0, imc = 0,
		inteiro cont = 0

		faca{
			se(cont == 0){
				escreva("Digite a altura: ")
				leia(altura)
				escreva("Digite o peso: ")
				leia(peso)
				cont++
			}senao{
				escreva("\nDigite uma altura válida: ")
				leia(altura)
				escreva("Digite um peso válido: ")
				leia(peso)
				}
		}enquanto(altura<=0 ou peso<=0)
		
		imc = peso / (altura * 2)
		se(imc<18.5){
			escreva("\nO IMC da pessoa é : " + imc 
				 + "\nEstá abaixo do peso ")
			
			}
		senao se(imc>=18.5 e imc<25){
			escreva("\nO IMC da pessoa é : " + imc
			      + "\nEstá com peso normal")
			}
		senao se(imc>=25 e imc<30){
			escreva("\nO IMC da pessoa é : " + imc
				 + "\nEstá acima do peso ")
			}
		senao{
			escreva("\nO IMC da pessoa é : " + imc
				 + "\nEstá obeso ")
			}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 784; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */