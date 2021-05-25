import java.util.Scanner;
public class classePrincipal {

	public static void main(String [] args) {
		Scanner ler = new Scanner(System.in);
		double p,a,i;
		
		int meses = 0;
		double juros,valor_dinheiro,soma_juros = 0.0;
		
		System.out.println("Valor do emprestimo: ");
		p = ler.nextDouble();
		System.out.println("Valor a pagar por mes: ");
		a = ler.nextDouble();
		System.out.println("Juros: ");
		i = ler.nextDouble();
		
		while(p>0) {
			System.out.println("Mes: " + (meses+1));
			
			juros = p * i;
			System.out.printf("Valor do juros pago no mes: %.3f\n", juros);
			valor_dinheiro = a - juros;
			System.out.printf("Valor em dinheiro aplicado no pagamento da divida: %.3f\n", valor_dinheiro);
		    soma_juros += juros;
		    System.out.printf("Valor acumulado de juros ja pagos: %.4f\n", soma_juros);
		     p -= a;
		     p += juros;
		     System.out.printf("Valor ainda por pagar do emprestimo: %.4f\n", p);

		     meses++;
		   
		}
		
		System.out.println("Numero de meses necessarios pra pagar o emprestimo: " + meses);
		ler.close();
		
	}
}
