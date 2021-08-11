package ProjetoJavaGNB;

import java.util.Scanner;

public class QuitarDividas {
		Scanner leia = new Scanner(System.in);
		public double perguntarValor;
		private double perguntarSalario;
		public double perguntarTempo;
		
		public QuitarDividas (double perguntarValor,double perguntarSalario,double perguntarTempo)
		{
			this.perguntarValor = perguntarValor;
			this.perguntarSalario = perguntarSalario;
			this.perguntarTempo = perguntarTempo;
		}
		public void cadastraCliente(){
			System.out.println("Mínimo 3 meses para juntar dinheiro");
			System.out.println("\nQuanto é a divida? ");
			this.setPerguntarValor(leia.nextDouble());
		    System.out.println("Qual seu Salario? ");
		    this.setPerguntarSalario(leia.nextDouble());
		    System.out.println("Quanto tempo quer quitar a divida? ");
		    this.setPerguntarTempo(leia.nextDouble());
		}
		public double getPerguntarValor() {
			return perguntarValor;
		}
		public void setPerguntarValor(double perguntarValor) {
			this.perguntarValor = perguntarValor;
		}
		public double getPerguntarSalario() {
			return perguntarSalario;
		}
		public void setPerguntarSalario(double perguntarSalario) {
			this.perguntarSalario = perguntarSalario;
		}
		public double getPerguntarTempo() {
			return perguntarTempo;
		}
		public void setPerguntarTempo(double perguntarTempo) {
			this.perguntarTempo = perguntarTempo;
		}
		
}
