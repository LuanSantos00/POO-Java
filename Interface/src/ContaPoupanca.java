
public class ContaPoupanca extends Conta {
	
	public ContaPoupanca() {
		
	}
	public ContaPoupanca(int numero, String agencia,String titular, double saldo) {
		super(numero,agencia,titular,saldo);
		
	}
	
	public String getTipo() {
		return "Conta Poupanca";
	}
	public String dados() {
		return "Titular: " + this.titular + " \nAgencia: "  + this.agencia + "\nNúmero: " + this.numero + "\nSaldo: " + this.saldo
				+ "\nTipo: " + this.getTipo();
	}
}
