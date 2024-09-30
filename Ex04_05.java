import java.util.Scanner;

public class Ex04_05 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int[] n = new int[20];
        int[] pares = new int[20];
        int[] impares = new int[20];
        int countPares = 0, countImpares = 0;

        System.out.println("Digite 20 Números Inteiros:");
        for (int i = 0; i < 19; i++) {
            n[i] = leia.nextInt();

            if (n[i] % 2 == 0) {
                pares[countPares] = n[i];
                countPares++;
            } else {
                impares[countImpares] = n[i];
                countImpares++;
            }
        }

        System.out.print("Vetor de números: \n| ");
        for (int i = 0; i < 19; i++) {
            System.out.print(n[i] + " | ");
        }

        System.out.print("\n\nVetor de números pares: \n| ");
        for (int i = 0; i < countPares; i++) {
            System.out.print(pares[i] + " | ");
        }

        System.out.println("\n\nVetor de Ímpares: \n| ");
        for (int i = 0; i < countImpares; i++) {
            System.out.print(impares[i] + " | ");
        }

        leia.close();
    }
}
