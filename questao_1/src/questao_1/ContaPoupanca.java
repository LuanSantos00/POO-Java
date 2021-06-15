package questao_1;

public class ContaPoupanca extends Conta {
	protected double taxa;
	
	public ContaPoupanca(int numero, String titular, double saldo,double taxa) {
		super(numero, titular, saldo);
		this.taxa = taxa;
	}
	
	public void atualizarSaldo(){
		
		saldo = getSaldo() + (taxa*saldo);
	}

}