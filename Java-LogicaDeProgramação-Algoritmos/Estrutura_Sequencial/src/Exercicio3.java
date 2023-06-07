import java.util.Scanner;
import java.util.Locale;

public class Exercicio3 {
  
  public static void main(String [] args){

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner (System.in);

    String nome1, nome2;
    int idade1, idade2;
    double media;

    System.out.println("Informe o nome da primeira pessoa:");
    nome1 = sc.next();
    System.out.printf("Informe a idade do(a) %s:\n", nome1);
    idade1 = sc.nextInt();
    System.out.println("Informe o nome da segunda pessoa:");
    nome2 = sc.next();
    System.out.printf("Informe a idade do(a) %s:\n", nome2);
    idade2 = sc.nextInt();

    media = (double) (idade1 + idade2) / 2;
    
    System.out.printf("A idade média de %s e %s é de %.1f anos",nome1, nome2, media);


    sc.close();

  }


}
