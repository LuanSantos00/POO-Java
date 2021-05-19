
import java.util.ArrayList;
import java.util.Scanner;


public class Principal {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		ArrayList<PessoaFisica> pessoaF = new ArrayList<>();
		ArrayList<PessoaJuridica> pessoaJ = new ArrayList<>();
		
		System.out.println("Entre com o número de contribuintes: ");
		int n = ler.nextInt();
		int l=1;
		while(n>0) {
			
			System.out.println("Dados do contribuinte #" + l + ": " );
			 
			int y = 0;
			System.out.println("Pessoa Física ou Jurídica (f/j)?");
			String resp = ler.next();
			if(resp.equals("f")) {
				System.out.println("Nome: ");
				String nome = ler.next();
				System.out.println("Renda Anual: ");
				double rendaAnual = ler.nextDouble();
				System.out.println("Gastos com saúde: ");
				double gastosSaude = ler.nextDouble();
				pessoaF.add(y,new PessoaFisica(nome,rendaAnual,gastosSaude));
				pessoaF.get(y).nome = nome;
				pessoaF.get(y).rendaAnual = rendaAnual;
				pessoaF.get(y).gastos_saude = gastosSaude;
				y++;	
			}else if(resp.equals("j")) {
				System.out.println("Nome: ");
				String nome = ler.next();
				System.out.println("Renda Anual: ");
				double rendaAnual = ler.nextDouble();
				System.out.println("Numero de funcionários: ");
				int numeroFuncionarios = ler.nextInt();
				pessoaJ.add(y,new PessoaJuridica(nome,rendaAnual,numeroFuncionarios));
				pessoaJ.get(y).nome = nome;
				pessoaJ.get(y).rendaAnual = rendaAnual;
				pessoaJ.get(y).numeroFuncionarios = numeroFuncionarios;
				y++;
			}else {
				System.out.println("Operação Inválida");
			}
			l++;
			n--;
		}
		System.out.println("Taxas Pagas:");
		double taxaF = 0;
		double taxaJ = 0;
		
		for(int j = 0 ; j < pessoaF.size(); j++) {
			PessoaFisica obj = (PessoaFisica) pessoaF.get(j);
			System.out.println (obj.dados());
			taxaF += obj.valortotal();
			
		}
		for(int j = 0 ; j < pessoaF.size(); j++) {
			PessoaJuridica obj = (PessoaJuridica) pessoaJ.get(j);
			System.out.println (obj.dados());
			
			taxaJ += obj.valortotal();
		}
		
		
	}
}
