import java.util.Locale;
import java.util.Scanner;

public class Exemplo2 {
  
  public static void main(String[] args){
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    int N, i;
    double [] vet;
    double media, soma;

    N = sc.nextInt();
    vet = new double[N];

    for (i=0; i<N; i++){
      System.out.print(vet[i] + " ");
    }
    System.out.println();

    soma  = 0.0;
    for (i=0; i<N; i++){
      soma += vet[i];
    }

    System.out.printf("%.2f\n", soma);

    media = soma / N;
    System.out.printf("%.2f\n", media);

    sc.close();
  }
}
