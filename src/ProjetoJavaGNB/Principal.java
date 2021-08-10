package ProjetoJavaGNB;

import java.util.Scanner;

public class Principal {
	Scanner teclado = new Scanner(System.in);
	int v;
	private String nome;
	
	public Principal(String nome) {
		super();
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Scanner getTeclado() {
		return teclado;
	}

	public void setTeclado(Scanner teclado) {
		this.teclado = teclado;
	}
	
	public void cadastroNome() {
		System.out.println("\n\t---Projeto GNB---");
		System.out.println("Digite seu nome: ");
		nome = teclado.nextLine();
	}
	
	public void menu() {
		
			System.out.println("\n\t------MENU------");
			System.out.println("Olá " + nome +"!Escolha uma opção:");
			do {
			System.out.println("\n1-Quitar dividas\n2-Aprender a organizar finanças\n3-Juntar dinheiro\n0-Encerrar programa");
			v = teclado.nextInt();
			
			switch(v) {
			case 1:
				
				break;
			case 2:
				
				break;
			case 3:
				
				break;
			default:
				if(v != 0) {
					System.out.println("---------------------------");
					System.out.println("\nOps! Algo deu errado!\nPor favor tente novamente.");
				}
			}
		}while(v != 0);
		System.out.println("\nPrograma Encerrado!!!");
	}
}
