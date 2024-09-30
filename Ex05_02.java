import java.util.Scanner;

public class Ex05_02 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double[][] precos = new double[5][5];
        double[] mediaPorProduto = new double[5];
        double[] somaPorSupermercado = new double[5];
        double totalMaisBarato, totalMaisCaro;

        for (int i = 0; i < 5; i++) {
            System.out.println("Informe os Preços do Produto " + (i + 1) + " em 5 Supermercados:");
            for (int j = 0; j < 5; j++) {
                System.out.print("Supermercado " + (j + 1) + ": ");
                precos[i][j] = leia.nextDouble();
                mediaPorProduto[i] += precos[i][j];
                somaPorSupermercado[j] += precos[i][j];
            }
            mediaPorProduto[i] /= 5;
        }

        totalMaisBarato = somaPorSupermercado[0];
        totalMaisCaro = somaPorSupermercado[0];
        for (int j = 1; j < 5; j++) {
            if (somaPorSupermercado[j] < totalMaisBarato) {
                totalMaisBarato = somaPorSupermercado[j];
            }
            if (somaPorSupermercado[j] > totalMaisCaro) {
                totalMaisCaro = somaPorSupermercado[j];
            }
        }

        System.out.println("\nPreços em cada supermercado:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Produto " + (i + 1) + ": ");
            for (int j = 0; j < 5; j++) {
                System.out.print(precos[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nMédia de Preço por Produto:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Produto: " + (i + 1) + mediaPorProduto[i]);
        }

        System.out.println("\nSoma de Preços por Supermercado: ");
        for (int j = 0; j < 5; j++) {
            System.out.println("Supermercado: " + (j + 1) + somaPorSupermercado[j]);
        }

        System.out.println("\nTotal no Supermercado mais Barato: R$" + totalMaisBarato);
        System.out.println("Total no Supermercado mais Caro: R$" + totalMaisCaro);

        leia.close();
    }
}
