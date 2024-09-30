import java.util.Scanner;

public class Ex04_13 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int[] vetor1 = new int[10];
        int[] vetor2 = new int[10];
        int[] vetorIntercalado = new int[20];

        System.out.println("Digite 10 Elementos: ");
        for (int i = 0; i < 10; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vetor1[i] = leia.nextInt();
        }

        System.out.println("\nDigite mais 10 Elementos: ");
        for (int i = 0; i < 10; i++) {
            System.out.print("Elemento " + i + ": ");
            vetor2[i] = leia.nextInt();
        }

        int j = 0;
        for (int i = 0; i < 10; i++) {
            vetorIntercalado[j++] = vetor1[i];
            vetorIntercalado[j++] = vetor2[i];
        }

        System.out.println("\nVetor Intercalado: ");
        for (int i = 0; i < 20; i++) {
            System.out.print(vetorIntercalado[i] + " ");
        }

        leia.close();
    }
}
