programa
{
	inclua biblioteca Matematica-->mat
	funcao inicio()
	{
		real nota1,nota2,nota3,media

		escreva ("Escreva a primeira nota: ")
		leia(nota1)

		escreva ("Escreva a segunda nota: ")
		leia(nota2)

		escreva ("Escreva a terceira nota: ")
		leia(nota3)

		media = ((nota1*2)+(nota2*3)+(nota3*5))/10
		media = mat.arredondar(media, 2)
		escreva ("A média ponderada das notas é: " + media)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 408; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */