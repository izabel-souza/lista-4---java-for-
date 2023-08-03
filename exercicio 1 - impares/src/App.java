import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um inteiro entre 1 e 1000: ");
        int x = sc.nextInt();

        System.out.println("Impares entre 1 e " + x + ":");
        for(int i = 0; i < x; i++) {
            if(i % 2 != 0) {
                System.out.println(i);
            }
        }

        sc.close();
    }
}
