import java.util.Scanner;

public class Saida2 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int x;
    String s1, s2, s3;

    x = sc.nextInt();
    sc.nextLine(); // Usado para consumir a quebra de linha pendente do .nextInt
    s1 = sc.nextLine();  // .nexteLine serve para ler a linha inteira digita, enquanto o .next le apelas a palava
    s2 = sc.nextLine();
    s3 = sc.nextLine();

    System.out.println("Dados Digitados:");
    System.out.println(x);
    System.out.println(s1);
    System.out.println(s2);
    System.out.println(s3);

    sc.close();
  }
  
}
