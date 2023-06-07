import java.util.Scanner;

public class Exercicio3 {
  
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int x, y, i, min, max, soma;

    x = sc.nextInt();
    y = sc.nextInt();

    if (x < y){
      min = x;
      max = y;
    } else{
      min = y;
      max = x;
    }

    soma = 0;

    for ( i=min+1; i<max; i++){
      if ( i % 2 != 0) {
        soma += i;
      }
    }
    System.out.println(soma);

    sc.close();
  }
}
