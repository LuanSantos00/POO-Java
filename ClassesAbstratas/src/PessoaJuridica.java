

public class PessoaJuridica extends Pessoa {
	public int numeroFuncionarios;
	public PessoaJuridica(String nome, double rendaAnual, int numeroFuncionarios) {
		super(nome,rendaAnual);
		this.numeroFuncionarios = numeroFuncionarios;
	}
	public double calculoImposto() {
		double valor = 0;
		if(this.numeroFuncionarios >= 10) {
			valor = this.rendaAnual * 0.14;
		}else {
			valor = this.rendaAnual * 0.16;
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
