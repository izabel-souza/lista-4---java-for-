import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe n: ");
        int n = sc.nextInt();

        int fatorial = 1;
        for(int i = 1; i <= n; i++) {
            fatorial *= i;
        }

        System.out.printf("Fatorial de %d = %d%n1", n, fatorial);

        sc.close();
    }
}
