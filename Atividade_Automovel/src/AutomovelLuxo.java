
public class AutomovelLuxo extends AutomovelBasico {

	private static final byte NUMEROMAXIMOPRESTACOES = 36;
	private boolean direcaoHidraulica;
	private boolean cambioAutomatico;
	private boolean vidrosETravasEletricos;
	
	public float valor;
	public byte num;
	
	AutomovelLuxo(String m,String c,byte comb, boolean retro){
		super(m,c,comb,retro);
	}
	AutomovelLuxo(String m,String c,byte comb){
		super(m,c,comb);
	}
	
	//public float quantoCusta(){
		//return this.valor;
	//}
	//public byte quantasPrestacoes(){
		//return this.num;
	//}
	public double valorPrestacao(double val,byte n){
		return val/n;
	}
	
	@Override
	public String toString(){
		return "Carro: " + this.modelo +
				"\nValor do carro:  " + this.valor + 
				"\nQuantidade de Prestações: " + this.num +
				 "\nValor da Prestação: R$ " + this.valorPrestacao( valor, this.num);
	}
}
