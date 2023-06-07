import java.util.Scanner;

public class Exemplo1 {
 
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int[] vet;
    int N, i;

    N = sc.nextInt();
    vet = new int[N];

    for ( i=0; i<N; i++){
      vet[i] = sc.nextInt();
    }

    for (i=0; i<N; i++){
      if (vet[i] < 0){
        System.out.println(vet[i]);
      }
    }

    sc.close();
  }
}
