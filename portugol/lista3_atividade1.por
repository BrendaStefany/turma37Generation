programa
{
	
	funcao inicio()
	{

	inteiro filhos,cont,percentualPessoas=0
	real salario,maiorSalario = 0,totFilhos = 0, totSalario = 0

	
	para (cont=1;cont<=20;cont++) {

	limpa()
	escreva ("Informe o salário do habitante: R$")
	leia(salario)

	totSalario= totSalario + salario
	
	se (maiorSalario<=salario) {
		maiorSalario=salario
	}
	se (salario<=100){
		percentualPessoas= percentualPessoas + 1
		
	}
	
	escreva ("Informe o número de filhos do habitante:")
	leia(filhos)
	
	totFilhos = totFilhos + filhos
	} 

	limpa()

	percentualPessoas = (percentualPessoas*100)/20 

	escreva("A média do salário dos habitantes é: R$", totSalario/20)
	escreva("A média do número de filhos é: ", totFilhos/20)
	escreva ("\nO maior salário foi: R$", maiorSalario)
	escreva("\nO percentual de pessoas com salário até R$100 foi: ", percentualPessoas,"%\n")

	}
} 
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 166; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */