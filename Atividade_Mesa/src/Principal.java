import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int qtd_ped,num_mesa;
		double soma, s = 0;
		Mesa m1 = new Mesa();
		Mesa m2 = new Mesa();
		Mesa m3 = new Mesa();
		Mesa m4 = new Mesa();
		Mesa m5 = new Mesa();
		Mesa m6 = new Mesa();

		System.out.println("Cardápio: ");
		m1.produtos();
		System.out.println("Qual mesa deseja usar? ");
		num_mesa = ler.nextInt();
		System.out.print("\n");
		System.out.println("Quantos pedidos irá fazer?");
		qtd_ped = ler.nextInt();
		System.out.print("\n");
		
		System.out.println("Digite da seguinte forma: (id,quantidade)");
		while (qtd_ped > 0) {
			int id, qtd;
			id = ler.nextInt();
			qtd = ler.nextInt();
			soma = m1.pedido(id, qtd);

			s += soma;

			qtd_ped--;
		}

		System.out.println("Valor a pagar da mesa 1: " + s);
		
		

	}

}
