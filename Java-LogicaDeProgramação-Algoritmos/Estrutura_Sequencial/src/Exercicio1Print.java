import java.util.Locale;

public class Exercicio1Print {

  public static void main(String[] args){

    double largura = 10.0, comprimento = 30.0, metroQuadrado =  200.00, area, preco;
    Locale.setDefault(Locale.US);

    System.out.printf("Medidas do terrero:\nLargura: %.1f Metros\nComprimento: %.1f Metros\n\nValor do metro quadrado do terreno: $%.2f\n\n", largura, comprimento, metroQuadrado);

    area = largura * comprimento;
    preco = area * metroQuadrado;

    System.out.printf("Area do terreno: %.2f\n\nO preço do terreno é: $%.2f", area, preco);


  }
  
}
