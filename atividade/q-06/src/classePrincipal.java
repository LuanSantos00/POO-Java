import java.util.Scanner;

class classePrincipal{
  public static void main(String[] args){
    Scanner ler = new Scanner(System.in);
    String palavra;
    do{
        System.out.println("Digite a palavra:  ||para fechar digite (sair)");
        palavra = ler.nextLine();
        String nova_palavra;
        nova_palavra = reverse(palavra);
        if(!palavra.equals("sair"))
          System.out.println("palavra inversa: " + nova_palavra);

        if(nova_palavra.equals(palavra))
          System.out.println("Eh um palindromo.\n");
        else if(!palavra.equals("sair"))
          System.out.println("Nao eh um palindromo.\n");

      }while(!palavra.equals("sair"));
    ler.close();
  }


  public static String reverse (String str) {
     String temp = "";
     int t = str.length();
     for (int i = t - 1; i >= 0; i--)
       temp += str.charAt(i);
     return temp;
   }


}
