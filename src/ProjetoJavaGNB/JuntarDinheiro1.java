package ProjetoJavaGNB;

import java.util.Scanner;

public class JuntarDinheiro1 {
	
	double salario;
    double reserva;
	Scanner menu = new Scanner (System.in);
	
	public void dinheiro() {
		boolean x = true;
        System.out.println("\nPor favor digite seu salário: R$");
        salario = menu.nextInt();
		while (x) {
	        System.out.print("\tDeseja guardar quanto do seu salário?\n");
	        System.out.print("1- 5%\n");
	        System.out.print("2- 10%\n");
	        System.out.print("3- 15%\n");
	        System.out.print("4- 20%\n");
	        System.out.print("5- 25%\n");
	        System.out.print("6- 30%\n");

	        int opcao = menu.nextInt();

	        if (opcao > 6 || opcao == 0){
	            System.out.print("\n\tOpção não encontrado! Por favor tente novamente.\n");
	            menu.close(); 
	            break;
	        }
	        switch (opcao) {
	        case 1:
	        	reserva = (salario * 5)/100;
	        	System.out.println("\tRESERVA MENSAL --> R$"+Math.round(reserva));     
	            //System.exit(0);
	        	break;
	        case 2:
	        	reserva = (salario * 10)/100;
	        	System.out.println("\tRESERVA MENSAL --> R$"+Math.round(reserva));     
	            //System.exit(0);
	        	break;
	        case 3:
	        	reserva = (salario * 15)/100;
	        	System.out.println("\tRESERVA MENSAL --> R$"+Math.round(reserva));
	            //System.exit(0);
	        	break;
	        case 4:
	        	reserva = (salario * 20)/100;
	        	System.out.println("RESERVA MENSAL --> R$"+Math.round(reserva));     
	           // System.exit(0);
	        	break;
	        case 5:
	        	reserva = (salario * 25)/100;
	        	System.out.println("RESERVA MENSAL --> R$"+Math.round(reserva));     
	            //System.exit(0);
	        	break;
	        case 6:
	        	reserva = (salario * 30)/100;
	        	System.out.println("RESERVA MENSAL --> R$"+Math.round(reserva));     
	            break;
	            
	        }
	        menuDinheiro();
	        x = false;
		}
	}
		public void menuDinheiro(){
			int escolha3;
        	do {
         		System.out.println("\nSelecione uma opção: \n1-Curto Prazo\n2-Médio Prazo\n3-Longo Prazo");
         		escolha3 = menu.nextInt();
         		
         		switch(escolha3) {
         		case 1:
         			infoDinheiro(3, 6);
         			break;
         		case 2:					
         			infoDinheiro(12, 24);
         			break;
         		case 3:
         			infoDinheiro(36, 60);
         			break;
         		default: System.out.println("\nOps! Algo deu errado!\nPor favor tente novamente.");
         		}
         	}while(escolha3 < 1 || escolha3 > 3);
		}
		
		public void infoDinheiro(int v1, int v2) {
			System.out.println("\n\tSEU RENDIMENTO SERÁ: ");
			double total = (reserva + (reserva*0.04) )* v1;//3 - 12 -36
			if(v1 == 3) {
				System.out.printf("\nTerceiro mês: R$%.2f", total);
			}
			else if (v1 == 12) {
				System.out.printf("\nUm ano: R$%.2f", total);
			}
			else if (v1 == 36) {
				System.out.printf("\nTrês anos: R$%.2f", total);
			}
			total = reserva * v2;//6 - 24 - 60
			if(v2 == 6) {		
				System.out.printf("\nSexto mês: R$%.2f", total);
			}
			else if(v2 == 24) {		
				System.out.printf("\nDois anos: R$%.2f", total);
			}
			else if(v2 == 60) {		
				System.out.printf("\nCinco anos: R$%.2f", total);
			}
		}
}
