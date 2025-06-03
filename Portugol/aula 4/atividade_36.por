programa
{
    funcao inicio()
    {
        inteiro valor, notas100, notas50, notas20, notas10, notas5, resto

        escreva("Digite o valor do saque: ")
        leia(valor)

        notas100 = valor / 100
        resto = valor % 100

        notas50 = resto / 50
        resto = resto % 50

        notas20 = resto / 20
        resto = resto % 20

        notas10 = resto / 10
        resto = resto % 10

        notas5 = resto / 5
        resto = resto % 5

        escreval("Notas de 100: ", notas100)
        escreval("Notas de 50: ", notas50)
        escreval("Notas de 20: ", notas20)
        escreval("Notas de 10: ", notas10)
        escreval("Notas de 5: ", notas5)

        se (resto != 0)
        {
            escreval("Valor restante que não pode ser entregue em notas: ", resto)
        }
    }
}