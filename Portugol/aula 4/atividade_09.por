programa
{
funcao inicio()
{
    inteiro pontuacao

    escreva("Digite a pontuação do funcionário (0 a 10): ")
    leia(pontuacao)

    se (pontuacao >= 0 e pontuacao <= 5)
        escreva("Desempenho: Insatisfatório
")
    senao
        se (pontuacao <= 8)
            escreva("Desempenho: Satisfatório
")
        senao
            se (pontuacao <= 10)
                escreva("Desempenho: Excelente
")
            senao
                escreva("Pontuação inválida!
")
}
}