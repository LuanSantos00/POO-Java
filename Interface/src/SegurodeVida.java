
public class SegurodeVida implements Tributavel {

	public String titular;
	public int numeroApolice;
	public double valor;
	
	
	public SegurodeVida() {
		
	}
	public SegurodeVida(String titular,int numeroApolice,double valor) {
		this.titular = titular;
		this.numeroApolice = numeroApolice;
		this.valor = valor;
	}
	@Override
	public double getImposto() {
		return this.valor;
	}
	@Override
	public String getTitular() {
		return this.titular;
	}
	@Override
	public String getTipo() {
		return "Seguro de Vida";
	}
	public String dados() {
		return "Titular: " + this.titular + "\nNúmero Apolice: " + this.numeroApolice + "\nValor: " + this.valor
				+ "\nTipo: " + this.getTipo();
	}
	
}
