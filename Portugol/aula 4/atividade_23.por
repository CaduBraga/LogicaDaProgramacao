programa
{
    funcao inicio()
    {
        inteiro num, i
        logico primo

        escreva("Digite um número inteiro: ")
        leia(num)

        se (num <= 1)
        {
            escreval("Não é primo.")
            retorne
        }

        primo = verdadeiro

        para (i = 2; i <= num / 2; i++)
        {
            se (num % i == 0)
            {
                primo = falso
                pare
            }
        }

        se (primo)
        {
            escreval(num, " é primo.")
        }
        senao
        {
            escreval(num, " não é primo.")
        }
    }
}