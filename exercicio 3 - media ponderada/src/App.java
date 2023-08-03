import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe n: ");
        int n = sc.nextInt();

        float x, y, z;
        float media;
        for(int i = 0; i < n; i++) {
            System.out.println("Informe 3 valores com uma casa decimal: ");
            x = sc.nextFloat();
            y = sc.nextFloat();
            z = sc.nextFloat();

            media = (((x * 2) + (y * 3) + (z * 5)) / 10);
            System.out.printf("Media = %.1f%n", media);
        }

        sc.close();
    }
}
