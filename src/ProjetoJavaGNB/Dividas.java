package ProjetoJavaGNB;

import java.util.Scanner;

public class Dividas {
	
	private double valorDiv;
	private double sal;
	
	public Dividas(double valorDiv,double sal)
	{
		this.valorDiv = valorDiv;
		this.sal =sal;
	}
	Scanner leia = new Scanner(System.in);
	String resposta;
	
	public void getValorDiv() {
		System.out.println("Por favor, informe o valor de sua dívida");
		valorDiv=leia.nextDouble();		
	}
	
	public void setValorDiv(double valorDiv) {
		this.valorDiv = valorDiv;
	}
	
	public void getSal() {
		getValorDiv();
		System.out.println("Por favor, informe seu salário");
		double sala=leia.nextDouble();
		System.out.println("Por favor, informe quanto você pode direcionar por mês \npara isto de no maximo 30% do seu salário total:");
		double por =leia.nextDouble();
		double porl = sala * 0.3;
		if (por>porl)
		{	
			int resp;
			System.out.println("Você inseruiu um valor maior do que 30% \ntem certeza dessas descisão? \nAperte 1 para sim e 2 para não");
			resp= leia.nextInt();			
			
			if(resp == 2) 
			{				
				System.out.println("Por favor, digite outra quantidade de seu salário direcionada para quitar a dívida");
				por =leia.nextDouble();				
			}
			
		}
		double x = valorDiv/por;
		System.out.printf("%.0f meses.",x);
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	
}
