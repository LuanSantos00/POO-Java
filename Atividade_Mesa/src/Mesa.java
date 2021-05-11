
public class Mesa {
	double Soma;

	public Mesa() {
		
	}
	
	public void produtos() {
		System.out.println("ID: 01,1 kg de refeição: R$ 10,00");
		System.out.println("ID: 02, sobremesa: R$ 2,00");
		System.out.println("ID: 03, refrigerante 2L: R$ 7,00");
		System.out.println("ID: 04, refrigerante 600ml: R$ 4,00");
		System.out.println("ID: 05, refrigerante lata: R$ 3,00");
		System.out.println("ID: 06, cerveja: R$ 4,00");
	}

	public double pedido(double id, double quantidade) {
		double valor = 0, Soma = 0;
		
		if (id == 1) {
			valor = 10 * quantidade;

		}
		if (id == 2) {
			valor = 2 * quantidade;

		}
		if (id == 3) {
			valor = 7 * quantidade;
		}
		if (id == 4) {
			valor = 4 * quantidade;
		}
		if (id == 5) {
			valor = 3 * quantidade;
		}
		if (id == 6) {
			valor = 4 * quantidade;
		}
		return Soma += valor;
	}
	
	

}