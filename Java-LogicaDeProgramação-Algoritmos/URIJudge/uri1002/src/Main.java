import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
       Scanner sc = new Scanner(System.in);

        double area, n = 3.14159, raio;
       

        System.out.println("Informe o valor do raio: ");
        raio = sc.nextDouble();

        area = (raio*raio) * n;

        System.out.printf("A = %.4f", area);

        sc.close();
    }
}
