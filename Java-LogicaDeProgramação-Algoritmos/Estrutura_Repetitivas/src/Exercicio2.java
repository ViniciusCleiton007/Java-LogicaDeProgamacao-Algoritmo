import java.util.Scanner;

public class Exercicio2 {

  public static void main(String [] args){
    Scanner sc= new Scanner(System.in);

    int N, i, soma;

    N = sc.nextInt();

    for ( i=1; i<=10; i++){
      soma = i * N;
      System.out.println(N + " x " + i + " = " + soma);
    }
    sc.close();
  }
}