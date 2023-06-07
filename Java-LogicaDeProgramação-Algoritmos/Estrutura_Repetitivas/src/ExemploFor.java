import java.util.Scanner;

public class ExemploFor {

  public static void main(String[] args){
    try (Scanner sc = new Scanner(System.in)) {
      int N, x, soma, i;

      N = sc.nextInt();

      soma = 0;
      for ( i = 0; i  < N; i++){
        x = sc.nextInt();
        soma += x;
      }
      System.out.println(soma);

      sc.close();
    }
  }
}
