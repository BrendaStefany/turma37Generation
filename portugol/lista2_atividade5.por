programa
{
	
	funcao inicio()
	{
		real indiceDePoluicao

		escreva ("Qual o índice de poluição?")
		leia(indiceDePoluicao)

		se ((indiceDePoluicao>=0.05) e (indiceDePoluicao<=0.25)) {
			escreva ("O índice de poluicão é aceitável")
		} senao se ((indiceDePoluicao>=0.30) e (indiceDePoluicao<0.40)){
			escreva("As indústrias do 1º grupo devem suspender suas atividades")
		} senao se ((indiceDePoluicao>=0.40) e (indiceDePoluicao<0.50)){
			escreva("As indústrias do 1º e 2º grupo devem suspender suas atividades")
		} senao se (indiceDePoluicao>=0.50){
			escreva("Todos os grupo devem suspender suas atividades")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 581; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */