import java.util.Scanner;

public class Questao4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Bem vindo ao precisomealistar.com.br! \nDigite seu nome: ");
		String nome = input.nextLine();
		System.out.print("Digite sua idade: ");
		int idade = input.nextInt();
		System.out.print("Sexo - Digite 1 para MASCULINO ou 2 para FEMININO: ");
		int sexo = input.nextInt();

		if (sexo == 2) {
			System.out.print("O alistamento não é necessário!");
		}
		if (sexo == 1 && idade < 18) {
			System.out.print("Você ainda não atingiu a idade mínima para o alistamento!");
		}
		if (sexo == 1 && idade > 18) {
			System.out.print("Você já se alistou? \nDigite 1 para SIM e 2 para NÃO: ");
			int alistamento = input.nextInt();
			if (alistamento == 1) {
				System.out.print("O seu alistamento já foi realizado!");
			} else if (alistamento == 2) {
				System.out.print(
						"\nVocê já ultrapassou o prazo para o alistamento. \nProcure a junta militar mais próxima para revoler essa situação!");
			}
		}
		if (sexo == 1 && idade == 18) {
			System.out.print("Digite o número do seu título de eleitor: ");
			int tituloEleitor = input.nextInt();
			if (tituloEleitor <= 0) {
				System.out.print("Título inválido");
			} else {
				System.out.println("Título válido! Você pode se alistar. \n\nInsira os dados corretamente:");
				System.out.print("Digite o nome da sua mãe: ");
				String nada = input.nextLine();
				String nomeMae = input.nextLine();
				System.out.print("Digite o nome do seu pai: ");
				String nomePai = input.nextLine();
				System.out.print("Digite o seu CPF: ");
				int cpf = input.nextInt();
				System.out.print("Digite o número da sua certidão de nascimento: ");
				int certidaoNasc = input.nextInt();
				System.out.print("Digite o seu endereço: ");
				String nada1 = input.nextLine();
				String endereco = input.nextLine();
				System.out.print("Digite o seu número de telefone: ");
				int telefone = input.nextInt();
				System.out.print("Digite o seu email: ");
				String nada2 = input.nextLine();
				String email = input.nextLine();
				System.out.printf(
						"\nOs documentos que você nos enviou serão solicitados pela junta militar no seu alistamento. Confirme as informações abaixo: \nSeu nome: %s \nNome da mãe: %s \nNome do pai: %s \nCPF: %d \nCertidão de nascimento: %d \nEndereço: %s \nTelefone: %d \nEmail: %s",
						nome, nomeMae, nomePai, cpf, certidaoNasc, endereco, telefone, email);
			}

		}
		input.close();
	}
}