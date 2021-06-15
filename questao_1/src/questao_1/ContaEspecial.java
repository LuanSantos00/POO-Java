package questao_1;

public class ContaEspecial extends Conta {
	private double chequeEspecial;
	public ContaEspecial(int numero, String titular, double saldo, double chequeEspecial) {
		super(numero, titular, saldo);
		this.setChequeEspecial(chequeEspecial);
		
	}
	public double getChequeEspecial() {
		return chequeEspecial;
	}
	public void setChequeEspecial(double chequeEspecial) {
		this.chequeEspecial = chequeEspecial;
	}
	
	public void saque(double chequeEspecial){
		if(chequeEspecial < saldo || chequeEspecial > saldo ){
			saldo = saldo - chequeEspecial;
		}
		
	}

}