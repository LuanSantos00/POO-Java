
public class AutomovelBasico extends Automovel {

	private boolean retrovisorDoLadoDoPassageiro;
	private boolean limpadorDoVidroTraseiro;
	private boolean radioAMFM;
	
	public float valor;
	public byte num;
	
	AutomovelBasico(String m,String c,byte comb, boolean retro){
		super(m,c,comb);
		this.retrovisorDoLadoDoPassageiro = retro; 
	}
	
	AutomovelBasico(String m,String c,byte comb){
		super(m,c,comb);
	}
	/*
	public float quantoCusta(){
		return this.valor;
	}
	public double valorPrestacao(double val,byte n){
		return val/n;
	}
	*/
	
	@Override
	public String toString(){
		return "Carro: " + this.modelo +
				"\nValor do carro:  " + this.valor + 
				"\nQuantidade de Prestações: " + this.num +
				 "\nValor da Prestação: R$ " + this.valorPrestacao( valor, this.num);
	}
}
