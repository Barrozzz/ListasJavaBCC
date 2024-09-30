import java.util.Scanner;

public class Ex04_14 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int[] idades = new int[30];
        float[] alturas = new float[30];
        float somaAlturas = 0;
        float mediaAltura;

        for (int i = 0; i < 30; i++) {
            System.out.print("Digite a Idade do Aluno " + (i + 1) + ": ");
            idades[i] = leia.nextInt();
            System.out.print("Digite a altura do aluno " + (i + 1) + " (em m): ");
            alturas[i] = leia.nextFloat();

            somaAlturas += alturas[i];
        }

        mediaAltura = somaAlturas / 30;

        int contador = 0;
        System.out.println("\nAlunos com mais de 13 Anos e Altura Abaixo da Média: ");
        for (int i = 0; i < 30; i++) {
            if (idades[i] > 13 && alturas[i] < mediaAltura) {
                contador++;
                System.out.println("Aluno " + (i + 1) + " - Idade: " + idades[i] + ", Altura: " + alturas[i] + "m");
            }
        }

        System.out.println("\nTotal de alunos com mais de 13 anos e altura abaixo da média: " + contador);

        leia.close();
    }
}
