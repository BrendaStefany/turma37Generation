programa
{
	
	funcao inicio()
	{
		real num[5], numeroMaior = 0.00
		
		para (inteiro cont=0;cont<5;cont++){
			escreva("Digite um número: ")
			leia(num[cont])
			se (num[cont]>numeroMaior){
			numeroMaior=num[cont]
			}
		}
		
		para (inteiro contador=0;contador<5;contador++) {
			escreva (num[contador],"\n")
			
		}

		escreva("O maior número digitado é: ", numeroMaior)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 322; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */