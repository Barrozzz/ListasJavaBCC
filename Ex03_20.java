import java.util.Scanner;

public class Ex03_20 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int n;
        double nota;
        double soma = 0;

        System.out.print("Digite a Quantidade de Notas: ");
        n = leia.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Digite a " + i + "ª Nota: ");
            nota = leia.nextDouble();
            soma += nota;
        }

        System.out.println("Média das Notas: " + soma / n);
        leia.close();
    }
}
