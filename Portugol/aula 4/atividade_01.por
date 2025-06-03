programa
 {
funcao inicio(){
		inteiro planeta
		real massa, pesoMercurio, pesoVenus, pesoTerra, pesoMarte, pesoJupiter, pesoSaturno, pesoUrano
		faca {

	escreva ("\nDigite sua massa em Kg: ")
		leia (massa)
	escreva ("\nDigite o número correspondente ao planeta que deseja saber seu peso seguindo a tabela abaixo: \n1 - Mercúrio \n2 - Vênus \n3 - Terra \n4 - Marte \n5 - Júpiter \n6 - Saturno \n7 - Urano \n0 - Encerrar o programa\nNúmero escolhido: ")
		leia (planeta)

pesoMercurio = massa * 3.7
pesoVenus = massa * 8.87
pesoTerra = massa * 9.807
pesoMarte = massa * 3.71
pesoJupiter = massa * 24.79
pesoSaturno = massa * 10.44
pesoUrano = massa * 8.87

//o cálculo do peso é massa (constante, independente do planeta) * gravidade (variável de cada planeta)
		
		escolha (planeta) {
			caso 1: escreva ("\nO seu peso em Mercúrio é ",(pesoMercurio), "N\nLembrando que o peso é medido em N, diferente da massa, medida em Kg\n")pare
			caso 2: escreva ("\nO seu peso em Vênus é ",(pesoVenus), "N\nLembrando que o peso é medido em N, diferente da massa, medida em Kg\n")pare
			caso 3: escreva ("\nO seu peso na Terra é ",(pesoTerra), "N\nLembrando que o peso é medido em N, diferente da massa, medida em Kg\n")pare
			caso 4: escreva ("\nO seu peso em Marte é ",(pesoMarte), "N\nLembrando que o peso é medido em N, diferente da massa, medida em Kg\n")pare
			caso 5: escreva ("\nO seu peso em Júpiter é ",(pesoJupiter), "N\nLembrando que o peso é medido em N, diferente da massa, medida em Kg\n")pare
			caso 6: escreva ("\nO seu peso em Saturno é ",(pesoSaturno), "N\nLembrando que o peso é medido em N, diferente da massa, medida em Kg\n")pare
			caso 7: escreva ("\nO seu peso em Urano é ",(pesoUrano), "N\nLembrando que o peso é medido em N, diferente da massa, medida em Kg\n")pare
			caso contrario: escreva ("\nOpção inválida!=!\n")}} enquanto (planeta != 0)}}