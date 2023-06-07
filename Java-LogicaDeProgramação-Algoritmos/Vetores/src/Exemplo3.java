import java.util.Locale;
import java.util.Scanner;

public class Exemplo3 {
  
  public static void main(String[] args){
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    int N, i, cont;
    int [] idades;
    double []alturas;
    double soma, media, x;
    String [] nomes;

    N = sc.nextInt();
    nomes = new String[N];
    idades = new int[N];
    alturas = new double[N];

    for (i=0; i<N; i++){
      nomes[i] = sc.next();
      idades[i] = sc.nextInt();
      alturas[i] = sc.nextDouble();
    }

    soma = 0.0;
    for(i=0; i<N; i++){
      soma += alturas[i];
    }

    media = soma / N;
    System.out.printf("Altura média: %.2f\n", media);

    cont = 0;
    for(i=0; i<N; i++){
      if(idades[i] < 16){
        cont ++;
      }
    }

    x = (double)  cont * 100 / N;

    System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", x);
    sc.close();
  }
}
