import java.util.Scanner;
public class classePrincipal {
	public static void main(String [] args) {
		Scanner ler = new Scanner(System.in);
		int num,i,cont=0;
		int resto[] = new int [10];
		int posicao[] = new int [10];
		char bi[] = new char [10];
		//pode ler das duas formas
		/*
		resto = new int [10];
		posicao = new int [10];
		*/
		System.out.println("Digite o valor : ");
		num = ler.nextInt();
		
		for(i=0;num!=1;i++) {
			resto[i] = num%2;
			num = num/2;
			cont++;
		}
		resto[i+1] = 1;
		System.out.print(resto[i+1]);
		for(cont-=1;cont>=0;cont--) {
			System.out.print(resto[cont]);
		}
	
	}
}
