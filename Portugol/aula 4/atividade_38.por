programa
{
    funcao inicio()
    {
        inteiro votos1, votos2, votos3

        escreva("Digite o número de votos do candidato 1: ")
        leia(votos1)

        escreva("Digite o número de votos do candidato 2: ")
        leia(votos2)

        escreva("Digite o número de votos do candidato 3: ")
        leia(votos3)

        se (votos1 > votos2 && votos1 > votos3)
        {
            escreval("Candidato 1 venceu.")
        }
        senao se (votos2 > votos1 && votos2 > votos3)
        {
            escreval("Candidato 2 venceu.")
        }
        senao se (votos3 > votos1 && votos3 > votos2)
        {
            escreval("Candidato 3 venceu.")
        }
        senao
        {
            escreval("Houve empate.")
        }
    }
}