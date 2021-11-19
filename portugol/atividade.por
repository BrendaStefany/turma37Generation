programa {
inclua biblioteca Matematica-->mat

		funcao inicio () {
			real farenheit,celsius, arredonda
			cadeia nome

			escreva ("Escreva o seu nome: ")
			leia(nome)

			escreva("Escreva a temperatura do local: ")
			leia (farenheit)

			celsius = (farenheit-32)/1.8

			arredonda = mat.arredondar (celsius,2)

			escreva ("Oi, " ,nome, "a temperatura em celsius é ",arredonda)
		}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 388; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */