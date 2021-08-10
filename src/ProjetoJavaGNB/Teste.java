package ProjetoJavaGNB;

public class Teste {

	public static void main(String[] args) {

		//Teste do menu
		System.out.println("Bem-vindo!");
		System.out.println("\nDe agora em diante você vai ter nossa ajuda para cuidar das suas finanças!");
		System.out.println("Por favor, selecione uma opção no menu: ");
		System.out.println("\n1 para quitar dívidas");
		System.out.println("2 para aprender a organizar suas finanças");
		System.out.println("3 para juntar dinheiro");
		System.out.println("0 para encerrar o programa");
		
		//fazendo as opções do usuário
		
		//aqui vai ser necessário adicionar uma leitura de opção
		//opção = escolha (do usuário de acordo com menu)
		switch(escolha) //escolha entre 0,1,2 e 3
		{
		case 1:
			//ir para opção quitar dividas;
			//break;
		case 2:
			//ir para opção aprender a organizar finanças;
			//break;
		case 3:
			//ir para opção juntar dinheiro;
			//break;
		case 0:
			System.out.println("Você encerrou o programa, até mais!");
			//break;
		default:
			System.out.println("Por favor, digite uma opção váliida: ");	
			System.out.println("Por favor, selecione uma opção no menu: ");
			System.out.println("\n1 para quitar dívidas");
			System.out.println("2 para aprender a organizar suas finanças");
			System.out.println("3 para juntar dinheiro");
			System.out.println("0 para encerrar o programa");
		}
		
	}

}
