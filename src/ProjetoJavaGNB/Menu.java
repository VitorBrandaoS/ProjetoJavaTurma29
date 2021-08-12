package ProjetoJavaGNB;

import java.util.Scanner;

public class Menu{
	protected String nome;
	protected double salario;
	int v;
	Dividas div = new Dividas();
	InvestClass classe = new InvestClass();
	JuntarDinheiro1 dinheiro = new JuntarDinheiro1();
	Scanner teclado = new Scanner(System.in);
	
	
	public Menu(String nome, double salario) {
		super();
		this.nome = nome;
		this.salario = salario;
	}
	
	public void cadastro() {
		System.out.println("\n\t---Projeto GNB---");
		System.out.println("Digite seu nome: ");
		setNome(teclado.nextLine());
		/*System.out.println("Digite seu salário: R$");
		setSalario(teclado.nextDouble());*/
	}
	
	public void menu() {
		do {
		System.out.println("\n\n\t------MENU------");
		System.out.println("Olá "+ nome +"!Escolha uma opção:");		
		System.out.println("\n1-Quitar dividas\n2-Aprender a organizar finanças\n3-Juntar dinheiro\n0-Encerrar programa");
		v = teclado.nextInt();
		
		switch(v) {
		case 1:
			div.getSal();
			break;
		case 2:
			classe.investPrincipal(v);
			break;
		case 3:
			dinheiro.dinheiro();
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
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	
}
