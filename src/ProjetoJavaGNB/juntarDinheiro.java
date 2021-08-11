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
     }
        }
	}
}
      	

