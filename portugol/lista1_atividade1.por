programa
{
	
	funcao inicio()
	{

   inteiro data,mes,anoNasc,dataAtual,mesNasc,mesAtual,anoAtual,totalDias

   escreva ("Informe sua data de nascimento: ")
   leia (data)
   escreva ("Informe seu mês de nascimento: ")
   leia (mes)
   escreva ("Informe seu ano de nascimento: ")
   leia(anoNasc)
   escreva ("Informe sua data atual: ")
   leia (dataAtual)
   escreva ("Informe seu mês atual: ")
   leia (mesAtual)
   escreva ("Informe seu ano atual: ")
   leia(anoAtual)

   totalDias =(anoAtual-1) - anoNasc
   totalDias = totalDias *12
   totalDias = totalDias + (mesAtual-1)
   totalDias = totalDias * 30

escreva ("A idade aproximadamente em dias é: ", totalDias)
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 682; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */