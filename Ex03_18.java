import java.util.Scanner;

public class Ex03_18 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int n;
        int divisores = 0;

        System.out.print("Digite um Número: ");
        n = leia.nextInt();
        
        leia.close();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                divisores++;
            }
        }

        if (divisores == 2) {
            System.out.println("\n" + n + " é Primo");
        } else {
            System.out.println("\n" + n + " Não é Primo");
            System.out.print("Divisores: ");
            for (int i = 2; i <= n; i++) {
                if (n % i == 0) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}
