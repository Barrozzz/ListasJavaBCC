import java.util.Scanner;

public class Ex02_25 {
    public static void main(String[] args) {
        int valor, n100, n50, n10 , n5, n1;
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite o Valor do Saque (R$10 até R$600): ");
        valor = leia.nextInt();

        if (valor < 10 || valor > 600) {
            System.out.println("Valor Inválido");
        } else {
            n100 = valor / 100;
            valor %= 100;
            n50 = valor / 50;
            valor %= 50;
            n10 = valor / 10;
            valor %= 10;
            n5 = valor / 5;
            valor %= 5;
            n1 = valor;

            System.out.println("Notas de 100: " + n100);
            System.out.println("Notas de 50: " + n50);
            System.out.println("Notas de 10: " + n10);
            System.out.println("Notas de 5: " + n5);
            System.out.println("Moedas de 1: " + n1);
        }

        leia.close();
    }
}
