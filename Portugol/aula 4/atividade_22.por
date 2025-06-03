programa
{
    funcao inicio()
    {
        inteiro nota

        escreva("Digite a nota (0 a 10): ")
        leia(nota)

        se (nota >= 0 && nota <= 4)
        {
            escreval("Reprovado")
        }
        senao se (nota >= 5 && nota <= 6)
        {
            escreval("Recuperação")
        }
        senao se (nota >= 7 && nota <= 10)
        {
            escreval("Aprovado")
        }
        senao
        {
            escreval("Nota inválida.")
        }
    }
}
