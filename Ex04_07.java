import java.util.Scanner;

public class Ex04_07 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int[] numeros = new int[5];
        int soma = 0;
        int mult= 1;

        System.out.println("Digite 5 Números Inteiros: ");
        for (int i = 0; i < 5; i++) {
            numeros[i] = leia.nextInt();
            soma += numeros[i];
            mult *= numeros[i]; 
        }

        System.out.print("\nNúmeros: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(numeros[i] + " ");
        }

        System.out.println("\nSoma: " + soma);
        System.out.println("Multiplicação: " + mult);
        leia.close();
    }
}
