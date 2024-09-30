import java.util.Scanner;

public class Ex03_37 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        char[] gabarito = {'a', 'b', 'c', 'd', 'e'};
        char[] respostas = new char[5];
        int acertos, maiorNota = 0, menorNota = 5, totalAlunos = 0;
        double somaNotas = 0;
        char continuar;

        do {
            acertos = 0;
            totalAlunos++;
            
            System.out.println("\nAluno " + totalAlunos + "");

            for (int i = 0; i < 5; i++) {
                System.out.print("Resposta da Questão " + (i + 1) + ": ");
                respostas[i] = leia.next().charAt(0);

                if (respostas[i] == gabarito[i]) {
                    acertos++;
                }
            }

            somaNotas += acertos;

            if (acertos > maiorNota) {
                maiorNota = acertos;
            }
            if (acertos < menorNota) {
                menorNota = acertos;
            }

            System.out.println("\nTotal de Acertos: " + acertos);

            System.out.print("Deseja continuar ( S | N )? \n");
            leia.nextLine();
            continuar = leia.next().charAt(0);
        } while (continuar == 'S' || continuar == 's');

        System.out.println("\nMaior Nota: " + maiorNota);
        System.out.println("Menor Nota: " + menorNota);
        System.out.println("Média das Notas: " + (somaNotas / totalAlunos));

        leia.close();
    }
}
