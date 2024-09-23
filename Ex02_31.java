import java.util.Scanner;

public class Ex02_31 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double kgMorango, kgMaca, valorMorango, valorMaca, valorFinal;

        System.out.print("Digite a Quantidade de Morangos (Kg): ");
        kgMorango = leia.nextDouble();
        System.out.print("Digite a Quantidade de Maçãs (Kg): ");
        kgMaca = leia.nextDouble();

        if (kgMorango <= 5) {
            valorMorango = kgMorango * 2.50;
        } else {
            valorMorango = kgMorango * 2.20;
        }

        if (kgMaca <= 5) {
            valorMaca = kgMaca * 1.80;
        } else {
            valorMaca = kgMaca * 1.50;
        }

        valorFinal = valorMorango + valorMaca;

        if (kgMorango + kgMaca > 8 || valorFinal > 25) {
            valorFinal = valorFinal - (valorFinal * 0.10);
        }

        System.out.println("Valor a Pagar: R$" + valorFinal);

        leia.close();
    }
}
