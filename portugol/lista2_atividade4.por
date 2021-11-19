programa
{
	
	funcao inicio()
	{
		real base,altura,area


		escreva ("Informe o valor da base do triângulo: ")
		leia (base)

		escreva ("Informe o valor da altura do triângulo: ")
		leia (altura)

		se ((base>=0) e (altura>=0)) {
			area=base*altura

			escreva ("A área do triângulo é: ",area,"metros quadrados")
		} senao {
			escreva("Tente novamente com números positivos")
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 318; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */