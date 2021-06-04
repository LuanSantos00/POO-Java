import java.util.ArrayList;
import java.util.Scanner;


public class Principal {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		ArrayList<Conta> conta = new ArrayList<>();
		ArrayList<ContaCorrente> contaC = new ArrayList<>();
		ArrayList<ContaPoupanca> contaP = new ArrayList<>();
		ArrayList<SegurodeVida> seguro = new ArrayList<>();
		
		System.out.println("Entre com o número de cadastros: ");
		int n = ler.nextInt();
		int l=1;
		while(n>0) {
			
			System.out.println("Dados do contribuinte #" + l + ": " );
			
			int y = 0;
			System.out.println("Conta,Conta Corrente,Conta Poupança, Seguro de Vida (c/cc/cp/sv)?");
			String resp = ler.next();
			
			if(resp.equals("c")) {
				System.out.println("Titular: ");
				String titular = ler.next();
				System.out.println("Agencia: ");
				String agencia = ler.next();
				System.out.println("Numero: ");
				int numero = ler.nextInt();
				System.out.println("Saldo: ");
				double saldo = ler.nextDouble();
				conta.add(y,new Conta(numero,titular,agencia,saldo));
				conta.get(y).titular = titular;
				conta.get(y).agencia = agencia;
				conta.get(y).numero = numero;
				conta.get(y).saldo = saldo;
				y++;	
			}else if(resp.equals("cp")) {
				System.out.println("Titular: ");
				String titular = ler.next();
				System.out.println("Agencia: ");
				String agencia = ler.next();
				System.out.println("Numero: ");
				int numero = ler.nextInt();
				System.out.println("Saldo: ");
				double saldo = ler.nextDouble();
				contaP.add(y,new ContaPoupanca(numero,titular,agencia,saldo));
				contaP.get(y).titular = titular;
				contaP.get(y).agencia = agencia;
				contaP.get(y).numero = numero;
				contaP.get(y).saldo = saldo;
				y++;	
			}else if(resp.equals("cc")) {
				System.out.println("Titular: ");
				String titular = ler.next();
				System.out.println("Agencia: ");
				String agencia = ler.next();
				System.out.println("Numero: ");
				int numero = ler.nextInt();
				System.out.println("Saldo: ");
				double saldo = ler.nextDouble();
				contaC.add(y,new ContaCorrente(numero,titular,agencia,saldo));
				contaC.get(y).titular = titular;
				contaC.get(y).agencia = agencia;
				contaC.get(y).numero = numero;
				contaC.get(y).saldo = saldo;
				y++;	
			}else if(resp.equals("sv")){
				System.out.println("Titular: ");
				String titular = ler.next();
				System.out.println("NumeroApolice: ");
				int numeroApolice = ler.nextInt();
				System.out.println("Valor: ");
				double valor = ler.nextDouble();
				seguro.add(y,new SegurodeVida(titular,numeroApolice,valor));
				seguro.get(y).titular = titular;
				seguro.get(y).numeroApolice = numeroApolice;
				seguro.get(y).valor = valor;
				
				y++;	
			}else {
				System.out.println("Operação Inválida!");
				break;
			}
			l++;
			n--;
		}
		
		for(int j = 0 ; j < conta.size(); j++) {
			Conta obj = (Conta) conta.get(j);
			System.out.println (obj.dados());
			
		}
		for(int j = 0 ; j < contaC.size(); j++) {
			ContaCorrente obj = (ContaCorrente) contaC.get(j);
			System.out.println (obj.dados());
			
		}
		for(int j = 0 ; j < contaP.size(); j++) {
			ContaPoupanca obj = (ContaPoupanca) contaP.get(j);
			System.out.println (obj.dados());
			
		}
		for(int j = 0 ; j < seguro.size(); j++) {
			SegurodeVida obj = (SegurodeVida) seguro.get(j);
			System.out.println (obj.dados());
			
		}
		
	}
}