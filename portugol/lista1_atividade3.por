programa
{
	
	funcao inicio()
	{

	real custoFabrica,custoDistribuidor,custoImposto,custoConsumidor

	
	escreva ("Escreva qual o custo da fábrica? R$")
	leia(custoFabrica)

	custoDistribuidor = custoFabrica*0.28
	custoImposto = custoFabrica*0.45

	custoConsumidor = custoFabrica + custoDistribuidor + custoImposto

	escreva ("O custo ao consumidor é de: R$"+custoConsumidor)

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 199; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */