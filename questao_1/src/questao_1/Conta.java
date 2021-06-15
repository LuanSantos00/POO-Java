package questao_1;

public class Conta {
	private int numero;
	private String titular;
	protected double saldo;
	
	 public Conta(){
		 
	 };
		
	
	public Conta(int numero, String titular, double saldo) {
		super();
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public void saque(double valor) {
		this.saldo = this.saldo - valor;
	}
	public void deposita(double valor) {
		this.saldo = this.saldo - valor;
	}
	
	
	@Override
    public String toString() {
		return "Nome:  " + titular + ", Numero da conta:  " + numero +
		", Saldo: " + saldo; 
	}
	
	
	public void imprimir() {
		System.out.println("Nome:  " + this.titular);
		System.out.println("Numero da conta:  " + this.numero);
		System.out.println(" Saldo: " + this.saldo);
	} 
	
}