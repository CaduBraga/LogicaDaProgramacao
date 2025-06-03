programa
{
funcao inicio()
{
    real a, b, c

    escreva("Digite o lado A: ")
    leia(a)
    escreva("Digite o lado B: ")
    leia(b)
    escreva("Digite o lado C: ")
    leia(c)

    se (a + b > c e a + c > b e b + c > a)
    {
        se (a == b e b == c)
            escreva("Triângulo Equilátero
")
        senao
            se (a == b ou b == c ou a == c)
                escreva("Triângulo Isósceles
")
            senao
                escreva("Triângulo Escaleno
")
    }
    senao
        escreva("Os lados não formam um triângulo
")
}
}