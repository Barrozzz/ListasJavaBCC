import java.util.Scanner;

public class Ex03_09 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int n;

        do {
            System.out.print("Digite um Número entre 1 e 10 para Gerar a Tabuada: ");
            n = leia.nextInt();
        } while (n < 1 || n > 10);

        System.out.println("\nTabuada de " + n + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " X " + i + " = " + (n * i));
        }

        leia.close();
    }
}
