package ProjetoJavaGNB;

import java.util.Scanner;

public class juntarDinheiro{
	
	public static void main(String[] args) {

        Scanner menu = new Scanner (System.in);
        
        double salario = 4700.25;
        double reserva = 0;

        while (true) {      
        	                
     {
        System.out.print("\t\tDESEJA GUARDAR QUANTO DO SEU SALÁRIO?\n\n");
        System.out.print("\t\t1. 5%\n");
        System.out.print("\t\t2. 10%\n");
        System.out.print("\t\t3. 15%\n");
        System.out.print("\t\t4. 20%\n");
        System.out.print("\t\t5. 25%\n");
        System.out.print("\t\t6. 30%\n");

        int opcao = menu.nextInt();

        if (opcao >6 || opcao ==0){
            System.out.print("\n\t\tVOLTE OUTRO DIA SE QUISER POUPAR!");
            menu.close(); 
            break;
        }

        switch (opcao) {
        case 1:
        	reserva = (salario * 5)/100;
        	System.out.println("\t\tRESERVA MENSAL --> R$"+Math.round(reserva));     
            System.exit(0);

        case 2:
        	reserva = (salario * 10)/100;
        	System.out.println("\t\tRESERVA MENSAL --> R$"+Math.round(reserva));     
            System.exit(0);

        case 3:
        	reserva = (salario * 15)/100;
        	System.out.println("\t\tRESERVA MENSAL --> R$"+Math.round(reserva));     
            System.exit(0);
        case 4:
        	reserva = (salario * 20)/100;
        	System.out.println("\t\tRESERVA MENSAL --> R$"+Math.round(reserva));     
            System.exit(0);
        case 5:
        	reserva = (salario * 25)/100;
        	System.out.println("\t\tRESERVA MENSAL --> R$"+Math.round(reserva));     
            System.exit(0);
        case 6:
        	reserva = (salario * 30)/100;
        	System.out.println("\t\tRESERVA MENSAL --> R$"+Math.round(reserva));     
            System.exit(0);
        }
            int escolha3;
        	do {
         		System.out.println("Selecione uma opção: \n1-Curto Prazo\n2-Médio Prazo\n3-Longo Prazo");
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
        }
	}
	public void infoDinheiro(int v1, int v2) {
	System.out.println("\n\tSEU RENDIMENTO SERÁ: ");
	double total = reserva * v1;//3 - 12 -36
	if(v1 == 3) {
		System.out.println("Terceiro mês: R$" + total);
	}
	else if (v1 == 12) {
		System.out.println("Um ano: R$" + total);
	}
	else if (v1 == 36) {
		System.out.println("Três anos: R$" + total);
	}
	total = reserva * v2;//6 - 24 - 60
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
}
/*
public void menuColchao(int escolha) {
	
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
	
}
}
      	*/

