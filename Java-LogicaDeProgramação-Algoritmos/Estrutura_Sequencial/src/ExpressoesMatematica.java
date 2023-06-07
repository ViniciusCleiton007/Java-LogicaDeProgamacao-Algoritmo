public class ExpressoesMatematica {
  
  public static void main(String[] args){

    double x = 3.0;
    double y = 4.0;
    double z = -5.0;
    double A, B, C;

    A = Math.sqrt (x); // Math.sqrt usado para raiz quadrada - Ex: Váriavel A recebe raiz quadrade de X
    B = Math.sqrt (y);
    C = Math.sqrt (25.0);
    System.out.println("Raiz quadrada de " + x + " = " + A);
    System.out.println("Raiz quadrada de " + y + " = " + B);
    System.out.println("Raiz quadrada de 25 = " + C);

    A = Math.pow(x,y); // Math.pow é usado para números elevado - Ex: Variável A recebe o resultado de X elevado a Y
    B = Math.pow(x,2.0);
    C = Math.pow(5.0,2.0);
    System.out.println(x + " elevado a " + y  + " = " + A);
    System.out.println(x + " elevado ao quadrado = " + B);
    System.out.println("5 elevado ao quadrado = " + C);

    A = Math.abs(y); //  Math.abs é usado para o valor absoluto da variável - Ex: Váriavel A recebe valor absoluto de Y, se fr um valor negativo como: -5.0 o resultado absoluto ficaria: 5.0 (Faz a retirada do sinal de menos
    B = Math.abs(z);
    System.out.println("Valor absoluto de " + y + " = " + A);
    System.out.println("Valor absoluto de " + z + " = " + B);

  }
}
