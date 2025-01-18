programa
{
	inclua biblioteca Util
	funcao inicio()
	{
	cadeia nome
	real n1,n2,n3
	escreva ("Olá! Digite o seu nome completo: ")
	leia(nome)
	limpa()
	escreva ("Olá, seja bem-vindo(a), ",nome,".\n")
	n1 = Util.sorteia(1, 99999)
     n2 = Util.sorteia(1, 99999)
     n3 = Util.sorteia(1, 99999)
	escreva ("Aqui está seu extrato bancário: \nR$",n1, ",\nR$",n2,",\nR$",n3,".\n")
	se (n1 > n2 e n1 > n3)
     escreva("O maior gasto do seu extrato é: R$",n1)
     se (n2 > n1 e n2 > n3)
     escreva("O maior gasto do seu extrato é: R$",n2)
     se (n3 > n1 e n3 > n2)
     escreva("O maior gasto do seu extrato é: R$",n3)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 630; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */