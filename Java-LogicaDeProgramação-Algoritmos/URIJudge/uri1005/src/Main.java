import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double x, y, media;

        x = sc.nextDouble();
        y = sc.nextDouble();

        media = (x * 3.5 + y * 7.5) / 11;

        System.out.printf("MEDIA = %.5f\n", media);

        sc.close();
    }
}
