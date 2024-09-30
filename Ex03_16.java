import java.util.Scanner;

public class Ex03_16 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int n, valor;
        int maior = 0;
        int menor = 0;
        int soma = 0;

        System.out.print("Digite N de Valores: ");
        n = leia.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Digite o " + i + "º número: ");
            valor = leia.nextInt();
            soma += valor;
            if (i == 1) {
                maior = valor;
                menor = valor;
            } else if (valor > maior) {
            	maior = valor;
            } else if (valor < menor) {
            	menor = valor;
            }
        }

        System.out.println("\nMaior: " + maior);
        System.out.println("Menor: " + menor);
        System.out.println("Soma: " + soma);
        leia.close();
    }
}

