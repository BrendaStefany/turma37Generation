programa
{
	
	funcao inicio()
	{
		real numero = 0.00,somatorio = 0.00
		inteiro contadorNumero = 0

		enquanto (numero>=0) {
			limpa()
			escreva("Escreva um número positivo, e quando quiser parar digite um número negativo")
			leia(numero)
			se (numero>0) {
			contadorNumero = contadorNumero + 1
			somatorio = somatorio + numero
			}
		}

		limpa()
		
		escreva ("Somatório: ", somatorio)
		escreva ("\nMédia: ", somatorio/contadorNumero)
		escreva ("\nTotal de valores lidos: ", contadorNumero ,"\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 305; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */