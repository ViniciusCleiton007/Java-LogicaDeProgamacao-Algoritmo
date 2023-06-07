import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {

  public static void main(String[] args){
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    int a, b, c;

    System.out.println("Informe o  primeiro número inteiro: ");
    a = sc.nextInt();
    System.out.println("Informe o segundo número inteiro: ");
    b = sc.nextInt();
    System.out.println("Informe o terceiro número inteiro: ");
    c = sc.nextInt();

    if(a < b && a < c){
      System.out.println("MENOR = " + a);
    }
    else if(b < a && b < c){
      System.out.println("MENOR = " + b);
    }
    else if(c < a && c < b){
      System.out.println("MENOR = " + c);
    }
    else{
      System.out.println("MENOR = " + a);
    }

    sc.close();
  }
}
