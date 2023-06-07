import java.util.Locale;

public class Exemplo1 {
    public static void main(String[] args) {

        String product1 = "Computer";
        String product2 = "Office desk";

        byte age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.printf("Products:\n%s, which price is $ %.2f ", product1, price1);
        System.out.printf("\n%s, which price is $ %.2f", product2, price2);
        System.out.printf("\n\nRecord: %d years old, code %d ande gender: %s",age, code, gender);
        System.out.printf("\n\nMeasure with eight decimal places: %.8f\nRouded (three decimal places): %.3f", measure, measure);
        Locale.setDefault(Locale.US);
        System.out.printf("\nUS decimal point: %.3f", measure);
    }
}
