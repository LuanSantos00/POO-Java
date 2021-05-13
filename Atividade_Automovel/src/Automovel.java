
public class Automovel {
	public static final byte MOVIDOAGASOLINA = 1;
	public static final byte MOVIDOAALCOOL = 2;
	public static final byte MOVIDOADIESEL = 3;
	public static final byte MOVIDOAGAS = 4;
	
	public float valor;
	public byte num;
	
	public static final byte NUMEROMAXIMODEPRETACOES = 24;
	
	public String modelo;
	private String cor;
	private int combustivel;
	
	
	Automovel(String m, String c, int comb){
		this.modelo = m;
		this.cor = c;
		this.combustivel = comb;
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
