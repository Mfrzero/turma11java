programa
{
	
	funcao inicio()
	{
		// pegar nome do usuario se eh masculino ou feminino , ano de ascimento, conforme a idade
		//eu chamo de idoso/idosa acime = de 60 anos, maduro/madura entre 25 e 59 anos, jovem abaxo de 25
		cadeia nomeUsuario
		caracter opcao
		inteiro idade, anoNascimento
		
		escreva("Digite o seu nome: ")
		leia(nomeUsuario)
		escreva("Digite o ano de nascimento: ")
		leia(anoNascimento)
		
		idade = 2020 - anoNascimento	
			
		escreva("Digite M - masculino ou F - feminino :")
		leia(opcao)
		
		se (opcao == 'F' ou opcao == 'f'){
			
			escreva("Oi Senhora " + nomeUsuario + " você é ")

				se(idade >= 60){
				escreva("Idosa")
				}
				senao se(idade < 60 e idade >= 25){
				escreva("Madura")
				}
				senao se(idade < 25){
				escreva("Jovem")
				}
		}
		
		senao se (opcao =='M' ou opcao == 'm'){
			
			escreva("Oi Senhor " + nomeUsuario + + " você é ")
		
				se(idade >= 60){
				escreva("Idoso")
				}
				senao se(idade < 60 e idade >= 25){
				escreva("Maduro")
				}
				senao se(idade < 25){
				escreva("Jovem")
				}
		}
			
		senao {
			
			escreva("Oi Senhorx, ",nomeUsuario)
				
				se(idade >= 60){
				escreva("Idosa")
				}
				senao se(idade < 60 e idade >= 25){
				escreva("Madura")
				}
				senao se(idade < 25){
				escreva("Jovem")
				}
		}
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1306; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */