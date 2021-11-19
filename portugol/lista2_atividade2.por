programa
{
	
	funcao inicio()
	{
		real salarioTotal,salarioExcedente, C,N, excesso
		
		escreva("Escreva o código do operador: ")
		leia (C)

		escreva("Informe as horas trabalhadas por ele: ")
		leia(N)

		
		salarioTotal = N * 10
		
		se (N>50){
			excesso=(N-50)*20
			salarioTotal= (50*10)+excesso
			

			escreva ("\nO salário total é R$",salarioTotal," e o salário excedente é de R$",excesso,"\n")
			
		} senao {
			escreva ("\nO salário total é de R$",salarioTotal," e não teve horas excedentes\n")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 302; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */