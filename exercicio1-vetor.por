programa{

  inclua biblioteca Util

  funcao inicio(){
    inteiro i, j, copia, troca = 0, tam = 10, vet[10]

    para(i = 0; i < tam; i++)
      vet[i] = Util.sorteia(1, 100)

    
    para(i = 0; i < tam; i++)
      escreva(vet[i], ",")

    
    para(j = 1; j <= tam; j++){
      para(i = 0; i < tam - 1; i++){
        se(vet[i] < vet[i+1]){ 
          copia = vet[i]
          vet[i] = vet[i+1]
          vet[i+1] = copia
        }
      }
    }

    faca{
      troca = 0
      para(i = 0; i < tam - 1; i++){
        se(vet[i] < vet[i+1]){
          copia = vet[i]
          vet[i] = vet[i+1]
          vet[i+1] = copia
          troca = 1
        }
      }
    }enquanto(troca == 1)

  
    escreva("\n")
    para(i = 0; i < tam; i++)
      escreva(vet[i], ",")
  }
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 107; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
