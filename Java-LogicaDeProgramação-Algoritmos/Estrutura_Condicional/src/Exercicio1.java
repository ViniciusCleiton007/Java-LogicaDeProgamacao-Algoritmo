import java.util.Locale;
import java.util.Scanner;


public class Exercicio1 {
  
  public static void main(String [] args){
    Locale.setDefault(Locale.US);
    Scanner sc = new  Scanner (System.in);

    double nota1, nota2, notaFinal;

    System.out.println("Informe a primeira nota:");
    nota1 = sc.nextDouble();
    System.out.println("Informe a segunda nota:");
    nota2 = sc.nextDouble();

    notaFinal =  nota1 + nota2;

    if(notaFinal >= 60.00) {
      System.out.printf("NOTA FINAL: %.1f\nAPROVADO", notaFinal);
    }
    else{
      System.out.printf("NOTA FINAL: %.1f\nREPROVADO", notaFinal);
    }

    sc.close();

  }

}
