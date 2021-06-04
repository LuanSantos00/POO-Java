
public class ContaCorrente extends Conta implements Tributavel {

	public ContaCorrente() {
		
	}
	public ContaCorrente(int numero, String agencia,String titular, double saldo) {
		super(numero,agencia,titular,saldo);
	}
	@Override
	public String getTipo() {
		return "Conta Corrente";
	}
	@Override
	public double getImposto() {
		// TODO Auto-generated method stub
		return 100;
	}
	@Override
	public String getTitular() {
		// TODO Auto-generated method stub
		return this.titular;
	}
	public String dados() {
		return "Titular: " + this.titular + " \nAgencia: "  + this.agencia + "\nNúmero: " + this.numero + "\nSaldo: " + this.saldo
				+ "\nTipo: " + this.getTipo();
	}
}
