import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a quantidade de numeros: ");
        int n = sc.nextInt();
        
        int valor;
        int in = 0, out = 0;

        for(int i = 0; i < n; i++) {
            System.out.printf("Informe o %d valor:%n", i+1);
            valor = sc.nextInt();

            in = ((valor >= 10) && (valor <= 20)) ? in++ : out++;

        }

        System.out.println(in + " in");
        System.out.println(out + " out");
        
        sc.close();
    }
}
