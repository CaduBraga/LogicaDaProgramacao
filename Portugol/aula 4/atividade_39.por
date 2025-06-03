programa
{
    funcao inicio()
    {
        inteiro num

        escreva("Digite um número inteiro: ")
        leia(num)

        se (num == 0)
        {
            escreval("O número é zero, não é nem positivo nem negativo, nem par nem ímpar.")
        }
        senao
        {
            se (num > 0)
            {
                escreval("O número é positivo.")
            }
            senao
            {
                escreval("O número é negativo.")
            }

            se (num % 2 == 0)
            {
                escreval("O número é par.")
            }
            senao
            {
                escreval("O número é ímpar.")
            }
        }
    }
}