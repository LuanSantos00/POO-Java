package lista;
import java.util.Scanner;
import java.util.ArrayList;
public class Principal extends Product {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		ArrayList<Product> produtos = new ArrayList<>();
		ArrayList<UsedProduct> produtosU = new ArrayList<>();
		ArrayList<ImportedProduct> produtosI = new ArrayList<>();
		
		
		while(true) {
			System.out.println("1 - Adicionar");
			System.out.println("0- Encerrar");
			
			int op = ler.nextInt();
			
			switch(op) {
			case 1:
				System.out.println("Common, used or imported (c/u/i)?");
				String resp = ler.next();
				int i = 0;
				if(resp.equals("c")) {
					
						System.out.println("Nome do produto: ");
						String nome = ler.next();
						System.out.println("Preço do produto: ");
						double preco = ler.nextDouble();
						produtos.add(i,new Product());
						produtos.get(i).name = nome;
						produtos.get(i).price = preco;
						i++;	
					
					
				}
				else if(resp.equals("u")) {
					System.out.println("Nome do produto: ");
					String nome = ler.next();
					System.out.println("Preço do produto: ");
					double preco = ler.nextDouble();
					System.out.println("Data: ");
					String data = ler.next();
					produtosU.add(new UsedProduct());
					produtosU.get(0).name = nome;
					produtosU.get(0).price = preco;
					produtosU.get(0).manufactureDate = data;
				}
				else {
					System.out.println("Nome do produto: ");
					String nome = ler.next();
					System.out.println("Preço do produto: ");
					double preco = ler.nextDouble();
					System.out.println("customsFee: ");
					double customs = ler.nextDouble();
					produtosI.add(new ImportedProduct());
					produtosI.get(0).name = nome;
					produtosI.get(0).price = preco;
					produtosI.get(0).customsFee = customs;
				}
				break;
			case 0:
				for(int j = 0 ; j < produtos.size(); j++) {
					Product obj = (Product) produtos.get(j);
					System.out.println (obj.priceTag());
				}
				for(int m = 0 ; m < produtosU.size(); m++) {
					Product obj = (Product) produtosU.get(m);
					System.out.println (obj.priceTag());
				}
				for(int l = 0 ; l < produtosI.size(); l++) {
					Product obj = (Product) produtosI.get(l);
				    System.out.println (obj.priceTag());
				}
				break;
				default:
					break;
			}
			
		}
		
		
		
	}
}