package questao_1;


public class MainClass {
	public static void main(String[] args) {
		
		//i)
		Conta conta1 = new Conta(10,"Joao",500);
		ContaPoupanca conta2 = new ContaPoupanca(5,"Lucas",300,0.5);
		ContaEspecial conta3 = new ContaEspecial(2,"Maria",600,750);
		
		//conta
		conta1.toString();
		conta1.imprimir();
		System.out.println();
		
		//contapoupanca,atualizando a contapoupança ele da o novo valor calculado com a taxa!
		conta2.atualizarSaldo();
		conta2.imprimir();
		System.out.println();
		
		//contaespecial, ele consegue sacar uma quantia maior que o saldo!
		conta3.saque(750);
		conta3.imprimir();
		System.out.println();
		
		//ii)
		Conta conta4 =  conta2;
		conta4.deposita(100);
		conta4.saque(50);
		System.out.println("Conta 4 - Upcasting");
		conta4.imprimir();
		
		
		
		//iii)da erro
	//	ContaEspecial conta5 = conta1;
		
	
		
		
	
		
		
		
		
	}
}
