import java.util.Scanner; // Import da biblioteca Scanner para o usuario  digitar os dados

public class Saida {

  public static void main(String [] args){

  Scanner sc = new Scanner (System.in); //Objeto criado para o usuario poder digitar o valor
  
  String x;
  int y;
  double z;
  char c;
  
  x = sc.next(); //Saída de dados com String
  c = sc.next().charAt(0); //Saída de dados para caractere, onde pega o primeiro caractere da palavra
  y = sc.nextInt(); //Saída de dados com números inteiros
  z = sc.nextDouble(); //Saída de dados com números de ponto flutuantes
  System.out.println("Você digitou: "+ x);
  System.out.println("Você digitou: "+ c);
  System.out.println("Você digitou: " + y);
  System.out.println("Você digitou: " + z);

  sc.close(); // Finalização do objeto

 }
}
