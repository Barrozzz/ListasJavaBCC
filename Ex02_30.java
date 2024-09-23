import java.util.Scanner;

public class Ex02_30 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double litros, valorPagar;
        char tipoCombustivel;

        System.out.print("Digite a Quantidade de Litros: ");
        litros = leia.nextDouble();
        System.out.print("Tipo de Combustível (A - Álcool | G - Gasolina): ");
        tipoCombustivel = leia.next().charAt(0);

        if (tipoCombustivel == 'A' || tipoCombustivel == 'a') {
            if (litros <= 20) {
                valorPagar = litros * 1.90 * 0.97;
            } else {
                valorPagar = litros * 1.90 * 0.95;
            }
        } else if (tipoCombustivel == 'G' || tipoCombustivel == 'g') {
            if (litros <= 20) {
                valorPagar = litros * 2.50 * 0.96;
            } else {
                valorPagar = litros * 2.50 * 0.94;
            }
        } else {
            System.out.println("Tipo de Combustível Inválido");
            leia.close();
            return;
        }

        System.out.println("Valor a Pagar: R$" + valorPagar);

        leia.close();
    }
}