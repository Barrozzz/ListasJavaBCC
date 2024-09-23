import java.util.Scanner;

public class Ex02_24 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        float n1, n2, n3, m;

        System.out.print("Digite a Primeira Nota: ");
        n1 = leia.nextFloat();
        System.out.print("Digite a Segunda Nota: ");
        n2 = leia.nextFloat();
        System.out.print("Digite a Terceira Nota: ");
        n3 = leia.nextFloat();

        m = (n1 + n2 + n3) / 3;

        if (m == 10) {
            System.out.println("\nAprovado com Distinção com Nota: " + m);
        } else if (m >= 7 && m < 10) {
            System.out.println("\nAprovado com Nota: " + m);
        } else {
            System.out.println("\nReprovado com Nota: " + m);
        }

        leia.close();
    }
}

