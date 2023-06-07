import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    int M, N, i, j;
    double[][] numeros;
    double[] vet;
    double soma;

    M = sc.nextInt();
    N = sc.nextInt();

    numeros = new double[M][N];

    for (i = 0; i < M; i++) {
      for (j = 0; j < N; j++) {
        numeros[i][j] = sc.nextDouble();
      }
    }

    vet = new double[M];
    
    for (i = 0; i < M; i++) {
      soma = 0.0;

      for (j = 0; j < N; j++) {
        soma = soma + numeros[i][j];
      }

      vet[i] = soma;
    }

    for (i = 0; i < M; i++) {
      System.out.printf("%.1f%n", vet[i]);
    }

    sc.close();
  }
}