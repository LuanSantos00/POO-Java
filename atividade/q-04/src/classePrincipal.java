import java.util.Scanner;

public class classePrincipal {
	
	public static void main(String [] args) {
		Scanner ler = new Scanner(System.in);
		int [] fibonacci = new int[100];
		fibonacci[0] = 1;
		fibonacci[1] = 1;
		for(int i = 2; i < 100; i++) {
			fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
		}
		int valor;
		do {
			System.out.println("Digite um numero para verificar se pertece a sequencia || para sair digite 0: ");
			valor = ler.nextInt();
			boolean pertence = false;
			for(int i = 0 ; i<100; i ++) {
				if(valor == fibonacci[i]) {
					System.out.println("Esse numero pertence a sequencia");
					pertence = true;
					break;
				}
			}
			if(!pertence && valor !=0) {
				System.out.println("Esse numero nao pertence a sequencia");
			}
			if(valor == 0)
				System.out.println("Sessão encerrada!");
			
		}while(valor != 0);
		ler.close();
		
	}
}
