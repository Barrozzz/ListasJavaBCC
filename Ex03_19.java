import java.util.Scanner;

public class Ex03_19 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int n;
        int contDivisoes = 0;
        boolean primo;

        System.out.print("Digite um Valor para N: ");
        n = leia.nextInt();

        for (int i = 2; i <= n; i++) {
            primo = true;
            for (int j = 2; j < i; j++) {
                contDivisoes++;
                if (i % j == 0) {
                    primo = false;
                    break;
                }
            }
            if (primo) {
                System.out.println(i + " é Primo");
            }
        }

        System.out.println("Total de Divisões Executadas: " + contDivisoes);
        leia.close();
    }
}
