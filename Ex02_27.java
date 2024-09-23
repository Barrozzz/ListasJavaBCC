import java.util.Scanner;

public class Ex02_27 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double n;

        System.out.print("Digite um Número: ");
        n = leia.nextDouble();

        if (n == Math.floor(n)) {
            System.out.println("O Número " + n + " é Inteiro");
        } else {
            System.out.println("O Número " + n + " é Decimal");
        }

        leia.close();
    }
}
