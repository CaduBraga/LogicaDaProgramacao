programa
{
    funcao inicio()
    {
        real nota

        escreva("Digite a nota do aluno (0 a 10): ")
        leia(nota)

        se (nota >= 9.0 && nota <= 10.0)
        {
            escreval("Categoria A")
        }
        senao se (nota >= 7.0 && nota < 9.0)
        {
            escreval("Categoria B")
        }
        senao se (nota >= 5.0 && nota < 7.0)
        {
            escreval("Categoria C")
        }
        senao se (nota >= 3.0 && nota < 5.0)
        {
            escreval("Categoria D")
        }
        senao se (nota >= 0.0 && nota < 3.0)
        {
            escreval("Categoria E")
        }
        senao
        {
            escreval("Nota inválida")
        }
    }
}