import java.util.Scanner;

public class Ex05_01 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int tamanho;
        int somaElementos = 0;
        int maior = -9999;
        int menor = 9999;
        int pares = 0;
        int impares = 0;
        int somaDiagPrincipal = 0;
        int somaDiagSecundaria = 0;
        double media;

        do {
            System.out.print("Informe um Número Inteiro Ímpar (entre 3 e 11): ");
            tamanho = leia.nextInt();
        } while (tamanho < 3 || tamanho > 11 || tamanho % 2 == 0);

        int[][] matriz = new int[tamanho][tamanho];

        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                System.out.print("Digite um Valor: ");
                matriz[i][j] = leia.nextInt();
                somaElementos += matriz[i][j];

                if (matriz[i][j] > maior) {
                	maior = matriz[i][j];
                }
                if (matriz[i][j] < menor) {
                	menor = matriz[i][j];
                }

                if (matriz[i][j] % 2 == 0) {
                	pares++;
                }
                else {
                	impares++;
                }

                if (i == j) {
                	somaDiagPrincipal += matriz[i][j];
                }

                if (i + j == tamanho - 1) {
                	somaDiagSecundaria += matriz[i][j];
                }
            }
        }

        media = somaElementos / (tamanho * tamanho);

        System.out.println("\nMatriz:");
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nSoma dos Elementos: " + somaElementos);
        System.out.println("Média: " + media);
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
        System.out.println("Pares: " + pares);
        System.out.println("Ímpares: " + impares);
        System.out.println("Soma da Diagonal Principal: " + somaDiagPrincipal);
        System.out.println("Soma da Diagonal Secundária: " + somaDiagSecundaria);

        leia.close();
    }
}
