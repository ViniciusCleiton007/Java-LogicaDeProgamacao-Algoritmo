import java.util.Scanner;
import java.util.Locale;

public class Exercicio1Scanner {

  public static void main(String [] args){

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Digite a largura do terreno: ");
    double largura = sc.nextDouble();
    System.out.print("Digite o comprimento do terreno: ");
    double comprimento = sc.nextDouble();
    System.out.print("Digite a medida em metro quadrado do terreno: ");
    double metroQuadrado = sc.nextDouble();
    double  area, preco;

    System.out.printf("\nMedidas do terreno:\nLargura:  %.1f Metros\nComprimento: %.1f Metros\n\nPreço do metro quadrado do terreno: $%.2f\n\n", largura,  comprimento, metroQuadrado);

    area = largura * comprimento;
    preco = area * metroQuadrado;

    System.out.printf("Area do terreno: %.2f\n\nO preço do terreno é: $%.2f", area, preco);

    sc.close();



  }
  
}
