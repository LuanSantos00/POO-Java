import java.util.Scanner;

public class classePrincipal {
	public static void main(String [] args) {
		
		
		//metodo para ler do teclado
		Scanner ler = new Scanner(System.in);
		string nome;
		double salario,n_salario,soma_salario = 0.0,soma_nsalario = 0.0;
		while(true) {
			System.out.println("Digite seu nome: ");
			nome = ler.next();
			
			if(nome.equals("fim"))
				break;
			
			
			System.out.println("DIgite seu salario: ");
			salario = ler.nextDouble();
			
			soma_salario += salario;
			
			if(salario <= 150 ) {
				n_salario = salario + 0.25 * salario;
			}
			else if(salario > 150 && salario <=	 300) {
				n_salario = salario + 0.20 * salario;
			}
			else if(salario > 300 && salario <= 600) {
				n_salario = salario +  0.15 * salario;
			}
			else {
				n_salario = salario + 0.10 * salario;
			}
			
			soma_nsalario += n_salario; 
	
			
			System.out.println("Nome: " + nome);
			System.out.println("Salario atual " + salario);
			System.out.println("Salario com ajuste: " + n_salario);
			
		}
		System.out.println();
		System.out.println("Soma dos salario : " + soma_salario);
		System.out.printl("Soma dos salarios com ajustes: " + soma_nsalario);
		
		
		
		}
	}

