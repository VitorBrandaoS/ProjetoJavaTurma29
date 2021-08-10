package ProjetoJavaGNB;

import java.util.Scanner;

public class Investimento {
	
	public static void main(String[] args) {
		int escolha, escolha2, escolha3;
		double valor;
		Scanner teclado = new Scanner(System.in);
		System.out.println("\n\t--Menu de Escolha--");
		System.out.println("\n1-Couchão\n2-Poupança\n3-Renda fixa\n4-Renda variável");
		escolha = teclado.nextInt();
		switch(escolha) {
		case 1:
			System.out.println("\n\t---Couchão---");
			System.out.println("\nNão há rendimento aqui, apenas acumulo de valor depositado.");
			break;
		case 2:
			System.out.println("\n\t---Poupança---");
			System.out.println("Selecione uma opção abaixo: \n1-Fazer estimativa com o que tenho.\n2-Quero criar uma Meta!");
			escolha2 = teclado.nextInt();
			switch(escolha2) {
			case 1 :
				
					System.out.println("\n\t---Poupança---");
					System.out.println("\nDigite o valor que gostaria de depositar mensalmente: R$");
					valor = teclado.nextDouble();
					do {
					System.out.println("Selecione uma opção: \n1-Curto Prazo\n2-Médio Prazo\n3-Longo Prazo");
					escolha3 = teclado.nextInt();
					
					switch(escolha3) {
					case 1:
						System.out.println("\n\t---Rendimento---");
						double total = valor + (valor * 0.4) * 3;
						System.out.println("Terceiro mês: R$" + total);
						total = valor + (valor * 0.4) * 6;
						System.out.println("Sexto mês: R$" + total);
						break;
					case 2:					
						System.out.println("\n\t---Rendimento---");
						total = valor + (valor * 0.4) * 12;
						System.out.println("Um ano: R$" + total);
						total = valor + (valor * 0.4) * 24;
						System.out.println("Dois anos: R$" + total);
						break;
					case 3:
						System.out.println("\n\t---Rendimento---");
						total = valor + (valor * 0.4) * 36;
						System.out.println("Três anos: R$" + total);
						total = valor + (valor * 0.4) * 60;
						System.out.println("Cinco anos: R$" + total);
						break;
					default: System.out.println("\nOps! Algo deu errado!\nPor favor tente novamente.");
					}
				}while(escolha3 < 1 || escolha3 > 3);
				break;
				
			case 2 : 
				System.out.println("\n\t---Poupança---");
				System.out.println("\nDefina um valor que gostaria de alcançar: R$");
				valor = teclado.nextDouble();
				//Quero uma meta
				break;			
				default: System.out.println("\nOps! Algo deu errado!\nPor favor tente novamente."); 
			}
			
		case 3 :
			//Renda fixa
			
		case 4 :
			//Renda Variavel
			
		}
		
	}
}
