package ProjetoJavaGNB;

import java.util.Scanner;

public class MenuPrincipal {
	Scanner teclado = new Scanner(System.in);
	
	private String nome;
	
	public MenuPrincipal(String nome) {
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
	
	
}
