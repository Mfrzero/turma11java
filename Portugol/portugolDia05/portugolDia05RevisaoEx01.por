programa
{
	inclua biblioteca Matematica --> mat
	//Revisao EX01 
	funcao inicio()
	{
		inteiro cont = 0, cont2 = 0
		real precoNormal = 0, precoFinal = 0, duasVezes = 0, tresVezes = 0
		caracter opc

		faca{
			se(cont2 == 0){
				escreva("Digite o preço do produto: ")
				leia(precoNormal)
				cont2++
			}
			senao{
				escreva("Digite um preço do válido: ")
				leia(precoNormal)
				}
		}enquanto(precoNormal <= 0)
		
		escreva("\n        Tabela de pagamento")
		escreva("\n-----------------------------------")
		escreva("\n1 - À vista em dinheiro ou cheque")
		escreva("\n\n2 - À vista no cartão de crédito")
		escreva("\n\n3 -      Em duas vezes")
		escreva("\n\n4 -      Em três vezes")
		escreva("\n-----------------------------------\n")

		faca{

			se(cont == 0){
				escreva("\n\nEscolha a condição de pagamento: ")
				leia(opc)
				cont++
			}senao{
				escreva("\n\nEscolha a condição de pagamento válida: ")
				leia(opc)
				}
				escolha(opc){
					
					caso '1':
						 precoFinal = precoNormal - (precoNormal * 0.2)
						 pare
					caso '2':
						 precoFinal = precoNormal - (precoNormal * 0.15)
						 pare
					caso '3':
						 precoFinal = precoNormal
						 duasVezes = precoNormal / 2
						 pare
					caso '4':
						 precoFinal = precoNormal + (precoNormal * 0.1)
						 tresVezes = precoFinal / 3
						 pare
					caso contrario:
						escreva("\nEscolha uma opção de pagamento válida...")
						pare
					}
		}enquanto(opc != '1' e opc != '2' e opc != '3' e opc != '4')

		se(opc == '1' ou opc == '2'){
		escreva("\nPreço final: R$" + mat.arredondar(precoFinal, 2))
		}
		senao se(opc == '3'){
		escreva("\nPreço final: R$" + precoFinal 
			 + "\nCom duas parcelas de: R$" + mat.arredondar(duasVezes, 2))
		}
		senao{
		escreva("\nPreço final: R$" + precoFinal 
			 + "\nCom três parcelas de: R$" + mat.arredondar(tresVezes, 2))
			}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1133; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */