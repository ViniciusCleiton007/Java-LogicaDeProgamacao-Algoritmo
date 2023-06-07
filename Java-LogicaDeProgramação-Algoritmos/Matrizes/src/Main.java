import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int M, N, i, j;
    int[][] mat;

    M = sc.nextInt();
    N = sc.nextInt();

    mat = new int[M][N];

    for (i = 0; i < M; i++) {
      for (j = 0; j < N; j++) {
        mat[i][j] = sc.nextInt();
      }
    }
    for (i = 0; i < M; i++) {
      for (j = 0; j < N; j++) {
        System.out.print(mat[i][j] + " ");
      }
      System.out.println();
    }

    sc.close();

  }
}