import java.util.Scanner;

public class Ex03_33 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        double valorDivida, valorJuros, valorParcela, valorTotal;
        int parcelas;

        System.out.print("Informe o Valor da Dívida: R$");
        valorDivida = leia.nextDouble();

        System.out.println("Valor da Dívida  |  Juros  |  Parcelas  |  Valor da Parcela");

        for (int i = 0; i <= 4; i++) {
            if (i == 0) {
            	parcelas = 1;
            } else {
            	parcelas = i * 3;
            }

            switch (parcelas) {
                case 1:
                    valorJuros = 0;
                    break;
                case 3:
                    valorJuros = valorDivida * 0.10;
                    break;
                case 6:
                    valorJuros = valorDivida * 0.15;
                    break;
                case 9:
                    valorJuros = valorDivida * 0.20;
                    break;
                default:
                    valorJuros = valorDivida * 0.25;
                    break;
            }

            valorTotal = valorDivida + valorJuros;
            valorParcela = valorTotal / parcelas;

            System.out.println("R$" + valorTotal + "         | R$" + valorJuros + "  | " + parcelas + "         |  R$" + valorParcela);
        }

        leia.close();
    }
}
