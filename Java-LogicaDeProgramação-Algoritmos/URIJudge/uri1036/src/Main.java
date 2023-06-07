import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double a, b, c, r1, r2, delta;

        System.out.println("Informe o valor de A:");
        a = sc.nextDouble();
        System.out.println("Informe o valor de B:");
        b = sc.nextDouble();
        System.out.println("Informe o valor de C:");
        c = sc.nextDouble();

        delta = b * b - 4.0 * a * c;

        if (a == 0 || delta < 0.0){
            System.out.println("Impossivel calcular");
        }
        else{
            r1 = (-b  + Math.sqrt(delta)) / (2.0 * a );
            r2 = (-b  - Math.sqrt(delta)) / (2.0 * a );
            System.out.printf("R1 = %.5f\n", r1);
            System.out.printf("R2 = %.5f\n", r2);
        }

        sc.close();
    }
}
