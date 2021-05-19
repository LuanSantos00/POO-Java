
public class PessoaFisica extends Pessoa{

	public double gastos_saude;
	
	
	public PessoaFisica(String nome, double rendaAnual,double gastos_saude) {
		super(nome,rendaAnual);
		this.gastos_saude = gastos_saude;
	}
	
	public double calculoImposto() {
		double valor = 0;
		if(this.gastos_saude > 0) {
			if(this.rendaAnual < 20000) {
				 valor = (this.rendaAnual * 0.15) - (this.gastos_saude/2) ;
			}else if(this.rendaAnual > 20000) {
				valor = (this.rendaAnual * 0.25) - (this.gastos_saude/2);
			}else {
				if(this.rendaAnual < 20000) {
					 valor = (this.rendaAnual * 0.15)  ;
				}else if(this.rendaAnual > 20000) {
					valor = (this.rendaAnual * 0.25) ;
			}
			
		}	
		
	}
		return valor;
  }
	public double valortotal() {
		double soma = 0;
		soma += this.calculoImposto();
		
		return soma;
	}
	
	public String dados() {
		return "nome: " + this.nome + " $ "  + this.calculoImposto();
	}
}