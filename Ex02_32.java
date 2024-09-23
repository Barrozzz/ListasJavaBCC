import java.util.Scanner;

public class Ex02_32 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int tipoCarne;
        double kgCarne, precoTotal, valorFinal;
        char pagamentoCartao;

        System.out.print("Digite o Tipo de Carne (1 - File Duplo | 2 - Alcatra | 3 - Picanha): ");
        tipoCarne = leia.nextInt();
        System.out.print("Digite a Quantidade de Carne (Kg): ");
        kgCarne = leia.nextDouble();
        System.out.print("Pagamento com Cartão Tabajara? (s/n): ");
        pagamentoCartao = leia.next().charAt(0);

        if (tipoCarne == 1) {
            if (kgCarne <= 5) {
                precoTotal = kgCarne * 4.90;
            } else {
                precoTotal = kgCarne * 5.80;
            }
        } else if (tipoCarne == 2) {
            if (kgCarne <= 5) {
                precoTotal = kgCarne * 5.90;
            } else {
                precoTotal = kgCarne * 6.80;
            }
        } else if (tipoCarne == 3) {
            if (kgCarne <= 5) {
                precoTotal = kgCarne * 6.90;
            } else {
                precoTotal = kgCarne * 7.80;
            }
        } else {
            System.out.println("Tipo de carne inválido.");
            leia.close();
            return;
        }

        valorFinal = precoTotal;
        if (pagamentoCartao == 's' || pagamentoCartao == 'S') {
            valorFinal *= 0.95;
        }

        System.out.print("\nTipo de Carne: " + tipoCarne);
        System.out.print("\nQuantidade: " + kgCarne + " Kg");
        System.out.print("\nPreço Total: R$" + precoTotal);
        if (pagamentoCartao == 's' || pagamentoCartao == 'S') {
            System.out.print("\nPagou no Cartão Tabajara! Desconto: 5%");
        } else {
        	System.out.print("\nNão Pagou no Cartão! Perdeu o Desconto!");
        }
        System.out.print("\nValor Final a Pagar: R$" + valorFinal);

        leia.close();
    }
}
