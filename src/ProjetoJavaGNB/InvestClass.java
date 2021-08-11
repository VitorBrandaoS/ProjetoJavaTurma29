package ProjetoJavaGNB;

import java.util.Scanner;

public class InvestClass {
	Scanner teclado = new Scanner(System.in);
	int escolha, escolha2, escolha3;
	double valor;
		
	/*public void infoColchao(int v1, int v2) {
		System.out.println("\n\t---Seu Colchão possui---");
		double total = valor * v1;//3 - 12 -36
		if(v1 == 3) {
			System.out.println("Terceiro mês: R$" + total);
		}
		else if (v1 == 12) {
			System.out.println("Um ano: R$" + total);
		}
		else if (v1 == 36) {
			System.out.println("Três anos: R$" + total);
		}
		total = valor * v2;//6 - 24 - 60
		if(v2 == 6) {		
			System.out.println("Sexto mês: R$" + total);
		}
		else if(v2 == 24) {		
			System.out.println("Dois anos: R$" + total);
		}
		else if(v2 == 60) {		
			System.out.println("Cinco anos: R$" + total);
		}
	}
	
	public void menuColchao(int escolha) {
		System.out.println("\n\t---Colchão---");
		System.out.println("\nNão há rendimento aqui, apenas acumulo de valor depositado.");
		System.out.println("\n\t---Colchão---");
		System.out.println("\nDigite o valor que gostaria de depositar mensalmente: R$");
		valor = teclado.nextDouble();
		do {
			System.out.println("Selecione uma opção: \n1-Curto Prazo\n2-Médio Prazo\n3-Longo Prazo");
			escolha3 = teclado.nextInt();
			
			switch(escolha3) {
			case 1:
				infoColchao(3, 6);
				break;
			case 2:					
				infoColchao(12, 24);
				break;
			case 3:
				infoColchao(36, 60);
				break;
			default: System.out.println("\nOps! Algo deu errado!\nPor favor tente novamente.");
			}
		}while(escolha3 < 1 || escolha3 > 3);
		
	}*/
	
	public void infoRendimento(int v1, int v2, double v3) {
		System.out.println("\n\t---Seu Rendimento foi---");
		double total = (valor + (valor * v3)) * v1;
		if(v1 == 3) {
			System.out.println("Terceiro mês: R$" + total);
		}
		else if (v1 == 12) {
			System.out.println("Um ano: R$" + total);
		}
		else if (v1 == 36) {
			System.out.println("Três anos: R$" + total);
		}
		total = (valor + (valor * v3)) * v2;
		if(v2 == 6) {		
			System.out.println("Sexto mês: R$" + total);
		}
		else if(v2 == 24) {		
			System.out.println("Dois anos: R$" + total);
		}
		else if(v2 == 60) {		
			System.out.println("Cinco anos: R$" + total);
		}
	}
	
	public void subMenuPoupanca1(int escolha) {
		//Estimativa com o que tenho
		System.out.println("\n\t---Poupança---");
		System.out.println("\n\t---Estimativa com o que tenho---");
		System.out.println("\nDigite o valor que gostaria de depositar mensalmente: R$");
		valor = teclado.nextDouble();
		do {
		System.out.println("Selecione uma opção: \n1-Curto Prazo\n2-Médio Prazo\n3-Longo Prazo");
		escolha3 = teclado.nextInt();
		
		switch(escolha3) {
		case 1:
			infoRendimento(3,6, 0.04);
			break;
		case 2:					
			infoRendimento(12,24, 0.04);
			break;
		case 3:
			infoRendimento(36,60, 0.04);
			break;
		default: System.out.println("\nOps! Algo deu errado!\nPor favor tente novamente.");
		}
		}while(escolha3 < 1 || escolha3 > 3);
	
	}
	
	public void subMenuPoupanca2(int escolha) {
		//Quero uma meta
		System.out.println("\n\t---Poupança---");
		System.out.println("\n\t---Quero uma Meta!---");
		System.out.println("\nDefina um valor que gostaria de alcançar: R$");
		valor = teclado.nextDouble();	
	}
	
	public void menuPoupanca(int escolha) {
		System.out.println("\n\t---Poupança---");
		System.out.println("Selecione uma opção abaixo: \n1-Fazer estimativa com o que tenho.\n2-Quero criar uma Meta!");
		escolha2 = teclado.nextInt();
		switch(escolha2) {
		case 1 :
				subMenuPoupanca1(escolha2);				
			break;
		case 2 : 
				subMenuPoupanca2(escolha2);
			break;
			default: System.out.println("\nOps! Algo deu errado!\nPor favor tente novamente.");
		}
	}
	
	public void menuRendaFixa(int escolha) {
		//Renda fixa
		System.out.println("\n\t---Renda fixa---");
		System.out.println("Selecione uma opção abaixo: \n1-Fazer estimativa com o que tenho.\n2-Quero criar uma Meta!");
		escolha2 = teclado.nextInt();
		switch(escolha2) {
		case 1 :
			subMenuRendaFixa1(escolha2);
			break;
			
		case 2 :
			subMenuRendaFixa2(escolha2);
			break;			
			default: System.out.println("\nOps! Algo deu errado!\nPor favor tente novamente."); 
		}		
	}
	
	public void subMenuRendaFixa1(int escolha) {
		System.out.println("\n\t---Renda fixa---");
		System.out.println("\nDigite o valor que gostaria de depositar mensalmente: R$");
		valor = teclado.nextDouble();
		do {
		System.out.println("Selecione uma opção: \n1-Curto Prazo\n2-Médio Prazo\n3-Longo Prazo");
		escolha3 = teclado.nextInt();
		
		switch(escolha3) {
		case 1:
			infoRendimento(3,6, 0.05);
			break;
		case 2:					
			infoRendimento(12,24, 0.05);
			break;
		case 3:
			infoRendimento(36,60, 0.05);
			break;
		default: System.out.println("\nOps! Algo deu errado!\nPor favor tente novamente.");
		}
		}while(escolha3 < 1 || escolha3 > 3);
	}
	
	public void subMenuRendaFixa2(int escolha) {
		//Quero uma meta
		System.out.println("\n\t---Renda fixa---");
		System.out.println("\nDefina um valor que gostaria de alcançar: R$");
		valor = teclado.nextDouble();
	}

	public void infoEstimativa(int v1, int v2) {
		//Estimativa Renda Variavel
		System.out.println("\n\t---Estimativa de Rendimento---");
		System.out.println("De acordo com o valor inserido, será cauculado 10% de acrecimo mensal em cima do valor base, com adicional da taxa variavel.");
		double total;
		if(v1 == 3) {
			total = (((valor + valor * 0.1) * (0.04)) * v1);
			System.out.println("Terceiro mês: R$" + total);			
		}
		else if (v1 == 12) {
			total = (((valor + valor * 0.1) * (0.06)) * v1);
			System.out.println("Um ano: R$" + total);			
		}
		else if (v1 == 36) {
			total = (((valor + valor * 0.1) * (0.1)) * v1);
			System.out.println("Três anos: R$" + total);
		}
		
		if(v2 == 6) {
			total = (((valor + valor * 0.1) * (0.05)) * v2);
			System.out.println("Sexto mês: R$" + total);
		}
		else if(v2 == 24) {		
			total = (((valor + valor * 0.1) * (0.08)) * v2);
			System.out.println("Dois anos: R$" + total);
		}
		else if(v2 == 60) {		
			total = (((valor + valor * 0.1) * (0.12)) * v2);
			System.out.println("Cinco anos: R$" + total);
		}
	}	
	
	public void subMenuRendaVariavel1(int escolha) {
		System.out.println("\n\t---Renda Variavel---");
		System.out.println("\nDigite o valor do investimento inicial: R$");
		valor = teclado.nextDouble();
		do {
		System.out.println("Selecione uma opção: \n1-Curto Prazo\n2-Médio Prazo\n3-Longo Prazo");
		escolha3 = teclado.nextInt();
		
		switch(escolha3) {
		case 1:
			infoEstimativa(3,6);
			break;
		case 2:					
			infoEstimativa(12,24);
			break;
		case 3:
			infoEstimativa(36,60);
			break;
		default: System.out.println("\nOps! Algo deu errado!\nPor favor tente novamente.");
		}
		}while(escolha3 < 1 || escolha3 > 3);
	}
	
	public void subMenuRendaVariavel2(int escolha) {
		//Quero uma meta
		System.out.println("\n\t---Renda Variavel---");
		System.out.println("\nDefina um valor que gostaria de alcançar: R$");
		valor = teclado.nextDouble();
	}
	
	public void menuRendaVariavel(int escolha) {
		//Renda Variavel
		System.out.println("\n\t---Renda Variavel---");
		System.out.println("Selecione uma opção abaixo: \n1-Fazer estimativa com o que tenho.\n2-Quero criar uma Meta!");
		escolha2 = teclado.nextInt();
		switch(escolha2) {
		case 1 :
			subMenuRendaVariavel1(escolha2);					
			break;
			
		case 2 : 
			subMenuRendaVariavel2(escolha2);
			break;
		}
	}
	
	public void investPrincipal(int v) {
		System.out.println("\n\t--Menu de Escolha--");
		System.out.println("\n1-Poupança\n2-Renda fixa\n3-Renda variável");
		escolha = teclado.nextInt();
		switch(escolha) {		
		case 1:
			menuPoupanca(escolha);
			break;
		case 2 :
			menuRendaFixa(escolha);
			break;
		case 3 :
			menuRendaVariavel(escolha);				
			break;
				default: System.out.println("\nOps! Algo deu errado!\nPor favor tente novamente.");
		}
	}
	
}