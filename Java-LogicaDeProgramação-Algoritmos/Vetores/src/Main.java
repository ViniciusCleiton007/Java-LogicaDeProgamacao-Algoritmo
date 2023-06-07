import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N, i;
        double [] vet;

        N = sc.nextInt();
        vet = new double[N];

        for (i=0; i<N; i++){
            vet[i] = sc.nextDouble();

        }

        for (i=0; i<N; i++){
            System.out.printf("%.2f\n", vet[i]);
            
        }

        sc.close();
        
    }
}
