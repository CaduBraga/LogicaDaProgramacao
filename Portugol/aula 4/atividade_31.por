programa
{
    funcao inicio()
    {
        inteiro num, raiz, quadrado

        escreva("Digite um número inteiro positivo: ")
        leia(num)

        se (num < 0)
        {
            escreval("Número inválido.")
            retorne
        }

        raiz = 0
        enquanto (raiz * raiz < num)
        {
            raiz = raiz + 1
        }

        quadrado = raiz * raiz

        se (quadrado == num)
        {
            escreval(num, " é um quadrado perfeito.")
        }
        senao
        {
            escreval(num, " não é um quadrado perfeito.")
        }
    }
}