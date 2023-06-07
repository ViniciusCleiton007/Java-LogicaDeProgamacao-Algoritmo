import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {

  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    int idade, soma = 0, cont = 0;
    double media;

    idade = sc.nextInt();

    while (idade >= 0) {
      soma += idade;
      cont += 1;
      idade = sc.nextInt();
    }
    if ( cont > 0){
      media  = (double) soma / cont;
      System.out.printf("%.2f\n", media);
    }else{
      System.out.println("Impossivel calcular");
    }



    sc.close();
  }
}


