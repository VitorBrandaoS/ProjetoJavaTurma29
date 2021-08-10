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
			//aqui fica a parte da branch dividas
			
			System.out.println("Por favor, informe o valor de sua dívida");
			//ler o valor da dívida
			System.out.println("Por favor, informe seu salário");
			//ler salário
			System.out.println("Por favor, informe quanto (em %) você pode direcionar por mês para isto:");
			//ler % do salário
			//caso ultrapasse 30% do salário:
			System.out.println("Você tem certeza que deseja direcionar todo este valor para quitar a dívida?");
			//ler resposta
			if(resposta==não)
			{
				System.out.println("Por favor, digite outra quantidade de seu salário direcionada para quitar a dívida");
				//ler nova quantidade
			}

			//aqui pode ter uma opção que compara o valor da dívida com o quanto o usuário pode direcionar e estimar o prazo.
			
			System.out.println("Você estará direcionando esta quantidade por mês e quitará sua dívida em tantos meses!");
			
			//fim da opção de quitar dívidas.
			
			//break;
		case 2:
			//ir para opção aprender a organizar finanças;
			
			/*System.out.println("Olá! Vamos começar com seu processo de educação financeira!");
			System.out.println("Por favor, nos diga seu salário:");
			//ler salário
			System.out.println("Por favor, nos diga quanto você gasta com despesas básicas (água, luz, telefone e etc):");
			//ler gastos básicos
			System.out.println("Por favor, nos diga quanto você gasta com compras no mercado:");
			//ler gastos mercado
			System.out.println("Por favor, nos diga o quanto você gasta com lazer: ");
			//ler gastos lazer
			System.out.println("Por favor, nos diga o quanto você gasta com transporte: ");
			//ler gastos transporte
			
			//totagastos = salario - gastos básicos - gastos mercado - gastos lazer - gastos transporte
			
			if(totalgastos<salario)
			{
				System.out.println("Você consegue economizar uma quantia por mês! Gostaria de ir para o menu de juntar dinheiro?");
				//ler opção sim ou não
				if(opção==sim)
				{
					//ir para menu de juntar dinheiro
					//case 3
				}
				else if(opção==não)
				{
					System.out.println("Tudo bem, mas continue com a rotina de anotar seus gastos para ter o hábito de acompanhar suas finanças! Bom trabalho!");
				}
			}
			else if (totalgastos>salário)
			{
				System.out.println("Você corre o risco de ter dívidas! Gostaria de ir para o menu de controle de dívidas?");
				//ler opção sim ou não
				if(opção==sim)
				{
					//ir para menu de controle de dívidas
					//case 1
				}
				else if(opção==não)
				{
					System.out.println("Tudo bem, mas continue com a rotina de anotar seus gastos para ter o hábito de acompanhar suas finanças! Bom trabalho!");
				}
				
			}
			else
			{
				System.out.println("Você controla bem seus gastos! Caso deseje um resultado ainda melhor, vá para a opção de juntar dinheiro!");
			}
			//break;*/
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
