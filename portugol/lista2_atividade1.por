programa
{
	
	funcao inicio()
	{
		real quilosTomate, excesso, multa

		escreva ("Informe o peso de tomates: (kg) ")
		leia(quilosTomate)

		se (quilosTomate>50) {

			excesso= quilosTomate-50
			multa = excesso * 4
			escreva("O valor do excesso foi de ", excesso,"kg e a multa é de R$" , multa)
		} senao {
			escreva("O valor do excesso e da multa é ZERO")
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 347; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */