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
	public double getValorDiv() {
		System.out.println("Por favor, informe o valor de sua dívida");
		valorDiv=leia.nextDouble();
		
		return valorDiv;
	}
	public void setValorDiv(double valorDiv) {
		this.valorDiv = valorDiv;
	}
	public double getSal() {
		System.out.println("Por favor, informe seu salário");
		sal=leia.nextDouble();
		System.out.println("Por favor, informe quanto você pode direcionar por mês para isto:");
		double por =leia.nextDouble();
		double porl=sal *(30/100);
		if (porl<por)
		{
			do
			{
		System.out.println("Você tem certeza que deseja direcionar todo este valor para quitar a dívida?");
		 resposta=leia.nextLine();
			}
			while(resposta!="sim");
			do
			{
			System.out.println("Por favor, digite outra quantidade de seu salário direcionada para quitar a dívida");
			por =leia.nextDouble();
			}
			while(porl<=por);
			
			
		}
		double x = valorDiv/por;
		System.out.println(x +" meses");
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	
}
