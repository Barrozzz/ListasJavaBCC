import java.util.Scanner;

public class Ex05_03 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double maiorNota = -9999;
        double menorNota = 9999;
        String alunoMaiorNota = "";
        String alunoMenorNota = "";
        double maiorMedia = -9999;
        double menorMedia = 9999;
        String alunoMaiorMedia = "";
        String alunoMenorMedia = "";
        double somaMediaTurma = 0;
        double mediaGeral;

        System.out.print("Informe o Número de Alunos: ");
        int numAlunos = leia.nextInt();
        String[] nomes = new String[numAlunos];
        double[][] notas = new double[numAlunos][2];
        double[] medias = new double[numAlunos];

        for (int i = 0; i < numAlunos; i++) {
            System.out.print("\nNome do Aluno " + (i + 1) + ": ");
            nomes[i] = leia.next();
            System.out.print("Nota 1: ");
            notas[i][0] = leia.nextDouble();
            System.out.print("Nota 2: ");
            notas[i][1] = leia.nextDouble();

            medias[i] = (notas[i][0] + notas[i][1]) / 2;
            somaMediaTurma += medias[i];

            if (notas[i][0] > maiorNota) {
                maiorNota = notas[i][0];
                alunoMaiorNota = nomes[i];
            }
            if (notas[i][1] < menorNota) {
                menorNota = notas[i][1];
                alunoMenorNota = nomes[i];
            }

            if (medias[i] > maiorMedia) {
                maiorMedia = medias[i];
                alunoMaiorMedia = nomes[i];
            }
            if (medias[i] < menorMedia) {
                menorMedia = medias[i];
                alunoMenorMedia = nomes[i];
            }
        }

        mediaGeral = somaMediaTurma / numAlunos;

        System.out.println("\nInformações dos Alunos:");
        for (int i = 0; i < numAlunos; i++) {
            System.out.println(nomes[i] + " - Nota 1: " + notas[i][0] + " | Nota 2: " + notas[i][1] + " | Média: " + medias[i]);
        }
        
        System.out.println("\nMaior Nota: " + maiorNota + " | Aluno " + alunoMaiorNota);
        System.out.println("Menor Nota: " + menorNota + " | Aluno " + alunoMenorNota);
        System.out.println("Maior Média: " + maiorMedia + " | Aluno " + alunoMaiorMedia);
        System.out.println("Menor Média: " + menorMedia + " | Aluno " + alunoMenorMedia);
        
        System.out.println("\nMédia Geral da Turma: " + mediaGeral);
        System.out.println("\nAlunos Acima da Média Geral: ");
        for (int i = 0; i < numAlunos; i++) {
            if (medias[i] > mediaGeral) {
                System.out.println(nomes[i] + " - Média: " + medias[i]);
            }
        }
        
        System.out.println("\nAlunos Abaixo da Média Geral: ");
        for (int i = 0; i < numAlunos; i++) {
            if (medias[i] < mediaGeral) {
                System.out.println(nomes[i] + " - Média: " + medias[i]);
            }
        }
        
        leia.close();
    }
}
