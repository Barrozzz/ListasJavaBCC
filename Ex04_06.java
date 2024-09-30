import java.util.Scanner;

public class Ex04_06 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double[] medias = new double[10];
        int alunosAcimaMedia = 0; 

        for (int i = 0; i < 10; i++) {
            double somaNotas = 0;

            System.out.println("\nDigite as 4 Notas do Aluno " + (i + 1) + ":");
            for (int j = 0; j < 4; j++) {
                System.out.print("Nota " + (j + 1) + ": ");
                double nota = leia.nextDouble();
                somaNotas += nota; 
            }

            medias[i] = somaNotas / 4.0; 
        }

        for (int i = 0; i < 9; i++) {
            if (medias[i] >= 7.0) {
                alunosAcimaMedia++;
            }
        }

        System.out.println("\nAlunos com Média Maior ou Igual a 7: " + alunosAcimaMedia);
        leia.close();
    }
}
