import java.util.Scanner;

public class Ex03_11 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int pares = 0, impares = 0, num;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite um Número: ");
            num = leia.nextInt();
            if (num % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println("Números Pares: " + pares);
        System.out.println("Números Ímpares: " + impares);
        leia.close();
    }
}
