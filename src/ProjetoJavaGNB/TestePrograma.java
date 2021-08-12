package ProjetoJavaGNB;

import java.util.Scanner;

public class TestePrograma {

	public static void main(String[] args) {
		
		Menu a = new Menu("",0);		
		InvestClass classe = new InvestClass();
		Scanner teclado = new Scanner(System.in);		
		a.cadastro();
		a.menu();
	}
}
