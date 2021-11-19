programa
{
	inclua biblioteca Matematica

	funcao inicio()
	{
	
		real x2,x1,y1,y2, distancia

	escreva ("Informe os pontos do plano 1 ")
	escreva("\nDigite o valor de x1 : ")
	leia(x1)
	escreva("Digite o valor de y1 : ")
	leia(y1)

	escreva ("\nInforme os pontos do plano 2 ")
	escreva("\nDigite o valor de x2 : ")
	leia(x2)
	escreva("Digite o valor de y2 : ")
	leia(y2)

	
	
	distancia = Matematica.arredondar((Matematica.raiz((Matematica.potencia((x2-x1),2)+ Matematica.potencia((y2-y1), 2)),2)),2)
	
	escreva("O valor da distância entre os pontos é ",distancia )	
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 574; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */