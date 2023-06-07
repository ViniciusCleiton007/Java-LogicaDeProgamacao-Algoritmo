import java.util.Scanner;
import java.util.Locale;

public class Exercicio2 {
  public static void main (String [] args){

  Locale.setDefault(Locale.US);
  Scanner sc= new Scanner (System.in);

  double base, altura, area, perimetro, diagonal;

  System.out.println("Informe o valor da base:");
  base = sc.nextDouble();
  System.out.println("Informe o valor da base:");
  altura =  sc.nextDouble();
  
  area = base * altura;
  perimetro = 2.0 * (base + altura);
  diagonal = Math.sqrt( Math.pow(base,2.0) + Math.pow(altura,2.0) );

  System.out.println("\nO valor da 'Area', 'Perimetro' e 'Diagonal'  do  retangulo é:\n");
  System.out.printf("Area = %.4f\n", area);
  System.out.printf("Perimetro = %.4f\n", perimetro);
  System.out.printf("Diagonal = %.4f", diagonal);
  
  sc.close();
  }
}
