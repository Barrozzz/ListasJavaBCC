import java.util.Scanner;

public class Ex02_16 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        float n1, n2, m;

        System.out.print("Digite a Primeira Nota: ");
        n1 = leia.nextFloat();
        System.out.print("Digite a Segunda Nota: ");
        n2 = leia.nextFloat();

        m = (n1 + n2) / 2;

        if (m < 3) {
            System.out.println("\nReprovado com Nota: " + m);
        } else if (m > 3 && m < 7) {
            System.out.println("\nEm Exame com Nota: " + m);
        } else {
        	System.out.println("\nAprovado com Nota: " + m);
        }

        leia.close();
    }
}