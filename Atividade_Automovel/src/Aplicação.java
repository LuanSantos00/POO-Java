
public class Aplicação {
	public static void main(String[] args) {
			
		Automovel al = new Automovel("FIAT","preto",Automovel.MOVIDOAGAS);
		AutomovelBasico ab = new AutomovelBasico("Celta","Azul",Automovel.MOVIDOAALCOOL); 	
		AutomovelLuxo aL = new AutomovelLuxo("Ferrari","vermelho",Automovel.MOVIDOADIESEL);
		
		al.valor = 35000;
		al.num = 20;
		
		
		ab.valor = 12500;
		ab.num = 10;
		
		aL.valor = 100000;
		aL.num = 30;
		
		imprime(al);
		imprime(ab);
		imprime(aL);
		
	}

	
	public static void imprime(Automovel a) {
		System.out.println("Dados dos automoveis!");
		System.out.println(a);
		System.out.println();
		
	}
}


