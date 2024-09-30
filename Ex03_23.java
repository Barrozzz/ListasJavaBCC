import java.util.Scanner;

public class Ex03_23 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int turmas, alunos;
        double media;
        int somaAlunos = 0;
        
        System.out.print("Digite o Número de Turmas: ");
        turmas = leia.nextInt();
        
        
        for (int i = 1; i <= turmas; i++) {
            do {
                System.out.print("Informe a Quantidade de Alunos da " + i + "ª Turma (Max. 40): ");
                alunos = leia.nextInt();
            } while (alunos < 0 || alunos > 40);
            somaAlunos += alunos;
        }
        
        media = somaAlunos / turmas;
        System.out.println("Média de Alunos por Turma: " + media);
        
        leia.close();
    }
}
