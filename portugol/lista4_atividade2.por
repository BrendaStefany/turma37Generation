programa
{
	
	funcao inicio()
	{
		inteiro matriz[3][3], l, c, soma = 0,soma2=0

		para (l=0;l<3;l++){

			para (c=0;c<3;c++) {
				escreva("Digite um valor: ")
				leia(matriz[l][c])
				soma += matriz[l][c]
				
			}

		}
		soma2 = matriz[0][0] + matriz[1][1] + matriz[2][2]
		escreva ("\nA soma de todos os valores da matriz é: ", soma,"\n")
		escreva("A soma dos valores na diagonal principal é: ",soma2,"\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 407; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {matriz, 6, 10, 6};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */