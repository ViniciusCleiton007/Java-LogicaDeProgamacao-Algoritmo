import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);

        int A, B, SOMA;

        System.out.println("Informeo valor inteiro de A:");
        A = sc.nextInt();
        System.out.println("Informe o valor inteiro de B:");
        B = sc.nextInt();

        SOMA = A + B;

        System.out.println("SOMA = " + SOMA);

        sc.close();

    }
}
