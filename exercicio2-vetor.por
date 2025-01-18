programa{

  funcao inicio(){
    inteiro i, num, pares[10], impares[10], contPar = 0, contImpar = 0, soma = 0
    real media

    para(i = 0; i < 10; i++){
      escreva("Digite o ", i + 1, "º número inteiro: ")
      leia(num)

      soma = soma + num


      se(num % 2 == 0){
        pares[contPar] = num
        contPar++
      }
      senao{
        impares[contImpar] = num
        contImpar++
      }
    }

    media = soma / 10.0

 
    escreva("\nNúmeros pares: ")
    para(i = 0; i < contPar; i++){
      escreva(pares[i], " ")
    }
  
    escreva("\nNúmeros ímpares: ")
    para(i = 0; i < contImpar; i++){
      escreva(impares[i], " ")
    }

    escreva("\nSoma de todos os números: ", soma)
    escreva("\nMédia de todos os números: ", media)
  }
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 255; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
