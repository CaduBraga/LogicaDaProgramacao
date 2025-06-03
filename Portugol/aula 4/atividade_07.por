programa
{
funcao inicio()
{
    caractere tipo

    escreva("Digite o tipo de produto (A - Alimento, B - Bebida, V - Vestuário): ")
    leia(tipo)

    escolha (tipo)
    {
        caso "A":
        caso "a":
            escreva("Produto cadastrado: Alimento - Perecível
")
            pare
        caso "B":
        caso "b":
            escreva("Produto cadastrado: Bebida - Não Perecível
")
            pare
        caso "V":
        caso "v":
            escreva("Produto cadastrado: Vestuário - Não Perecível
")
            pare
        caso contrario:
            escreva("Tipo inválido!
")
    }
}
}