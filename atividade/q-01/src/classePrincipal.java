import java.util.Scanner;
public class classePrincipal {
	public static void main(String [] args){
		
		Scanner sc = new Scanner(System.in);
		int a,b;
		
		System.out.println("Digite o primeiro numero: ");
		a = sc.nextInt();
		System.out.println("Digite o segundo numero: ");
		b = sc.nextInt();
		
		if(b>a) {
			for(int i = a; i<=b; i ++){
				if(i%2!=0){
					System.out.println(i);
				}
			}
		}
		else {
		for(int i = b; i<=a; i ++){
			if(i%2!=0){
				System.out.println(i);
			}
		}
	}

}
}