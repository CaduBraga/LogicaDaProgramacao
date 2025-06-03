programa
{
    funcao inicio()
    {
        inteiro a, b, c, temp

        escreva("Digite o primeiro número: ")
        leia(a)

        escreva("Digite o segundo número: ")
        leia(b)

        escreva("Digite o terceiro número: ")
        leia(c)

        se (a > b)
        {
            temp = a
            a = b
            b = temp
        }
        se (a > c)
        {
            temp = a
            a = c
            c = temp
        }
        se (b > c)
        {
            temp = b
            b = c
            c = temp
        }

        escreval("Números em ordem crescente: ", a, ", ", b, ", ", c)
    }
}