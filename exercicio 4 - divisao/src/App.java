import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe n: ");
        int n = sc.nextInt();

        float numerador, denominador;
        for(int i = 0; i < n; i++) {
            System.out.println("Informe o numerador e denominador respectivamente: ");
            numerador = sc.nextFloat();
            denominador = sc.nextFloat();

            System.out.println(((denominador == 0) ? "divisao impossivel" : (numerador / denominador)));
        }

        sc.close();
    }
}
