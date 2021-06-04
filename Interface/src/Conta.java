
public class Conta {
	public int numero;
	public String agencia;
	public String titular;
	public double saldo;
	
	public Conta() {
		
	}
	public Conta(int numero, String agencia,String titular, double saldo) {
		this.numero = numero;
		this.agencia = agencia;
		this.titular = titular;
		this.saldo = saldo;
	}
	public void deposita(double valor) {
		this.saldo += valor;
	}
	public void saca(double valor) {
		this.saldo -= valor;
	}
	public String getTipo() {
		return "Conta";
	}
	public String dados() {
		return "Titular: " + this.titular + " \nAgencia: "  + this.agencia + "\nNúmero: " + this.numero + "\nSaldo: " + this.saldo
				+ "\nTipo: " + this.getTipo();
	}
}
