import java.util.Scanner;

public class Ex03_35 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int codigo, quantidade;
        double total = 0;

        while (true) {
            System.out.print("\nInforme o Código do Item: ");
            codigo = leia.nextInt();
            if (codigo == 0) {
            	break;
            }

            System.out.print("Informe a Quantidade: ");
            quantidade = leia.nextInt();

            switch (codigo) {
                case 100:
                    total += 1.20 * quantidade;
                    System.out.println("Cachorro Quente: R$" + (1.20 * quantidade));
                    break;
                case 101:
                    total += 1.30 * quantidade;
                    System.out.println("Bauru Simples: R$" + (1.30 * quantidade));
                    break;
                case 102:
                    total += 1.50 * quantidade;
                    System.out.println("Bauru com Ovo: R$" + (1.50 * quantidade));
                    break;
                case 103:
                    total += 1.20 * quantidade;
                    System.out.println("Hambúrguer: R$" + (1.20 * quantidade));
                    break;
                case 104:
                    total += 1.30 * quantidade;
                    System.out.println("Cheeseburguer: R$" + (1.30 * quantidade));
                    break;
                case 105:
                    total += 1.00 * quantidade;
                    System.out.println("Refrigerante: R$" + (1.00 * quantidade));
                    break;
                default:
                    System.out.println("Código Inválido");
            }
        }

        System.out.println("\nTotal do Pedido: R$" + total);

        leia.close();
    }
}
