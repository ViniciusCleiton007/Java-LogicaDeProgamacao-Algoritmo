import java.util.Scanner;

public class Exercicio1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int N, i, j, cont;
    int[][] mat;

    N = sc.nextInt();

    mat = new int[N][N];

    for (i = 0; i < N; i++) {
      for (j = 0; j < N; j++) {
        mat[i][j] = sc.nextInt();
      }
    }
    System.out.println("DIAGONAL PRINCIPAL:");

    for (i = 0; i < N; i++) {
      System.out.print(mat[i][i] + " ");
    }
    System.out.println();

    cont = 0;

    for (i = 0; i < N; i++) {
      for (j = 0; j < N; j++) {
        if (mat[i][j] < 0) {
          cont = cont + 1;
        }
      }
    }
    System.out.println("QUANTIDADE DE NEGATIVOS = " + cont);

    sc.close();
  }
}
