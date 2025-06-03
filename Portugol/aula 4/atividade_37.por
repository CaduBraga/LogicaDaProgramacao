programa
{
    funcao inicio()
    {
        real capital, taxa, tempo, valorFinal

        escreva("Digite o capital inicial: ")
        leia(capital)

        escreva("Digite a taxa de juros mensal (em %): ")
        leia(taxa)

        escreva("Digite o tempo de aplicação (meses): ")
        leia(tempo)

        valorFinal = capital * (potencia(1 + taxa / 100, tempo))

        escreval("Valor final após ", tempo, " meses: ", valorFinal)
    }

    funcao real potencia(real base, real expoente)
    {
        real resultado = 1
        inteiro i

        para (i = 1; i <= expoente; i = i + 1)
        {
            resultado = resultado * base
        }

        retorne resultado
    }
}