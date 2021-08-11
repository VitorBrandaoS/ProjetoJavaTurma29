package ProjetoJavaGNB;

import java.util.Scanner;

public class Menu{
	private String nome;
	private double salario;
	int v;
	InvestClass classe = new InvestClass();
	Scanner teclado = new Scanner(System.in);
	
	
	public Menu(String nome, double salario) {
		super();
	}
	
	public void cadastro() {
		System.out.println("\n\t---Projeto GNB---");
		System.out.println("Digite seu nome: ");
		nome = teclado.nextLine();
		System.out.println("Digite seu salário: R$");
		salario = teclado.nextDouble();
	}
	
	public void menu() {
		do {
		System.out.println("\n\t------MENU------");
		System.out.println("Olá "+ nome +"!Escolha uma opção:");		
		System.out.println("\n1-Quitar dividas\n2-Aprender a organizar finanças\n3-Juntar dinheiro\n0-Encerrar programa");
		v = teclado.nextInt();
		
		switch(v) {
		case 1:
			
			break;
		case 2:
			classe.investPrincipal(v);
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
