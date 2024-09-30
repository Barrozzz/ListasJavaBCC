import java.util.Scanner;

public class Ex03_31 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int numeroAluno, maisAlto, maisBaixo, i;
        double altura, maiorAltura, menorAltura;
        
        maisAlto = 0; 
        maisBaixo = 0;
        maiorAltura = 0;
        menorAltura = 999;
        i = 1;
        
        while (i <= 10) {
            System.out.print("Informe o Nº do " + i + "º Aluno: ");
            numeroAluno = leia.nextInt();
            System.out.print("Informe a Altura do Aluno (cm): ");
            altura = leia.nextDouble();
            
            if (altura > maiorAltura) {
                maiorAltura = altura;
                maisAlto = numeroAluno;
            }
            if (altura < menorAltura) {
                menorAltura = altura;
                maisBaixo = numeroAluno;
            }
            i++;
        }
        
        System.out.println("\nAluno mais Alto (Nº " + maisAlto + "): " + maiorAltura + "cm");
        System.out.println("Aluno mais Baixo (Nº " + maisBaixo + "): " + menorAltura + "cm");
        
        leia.close();
    }
}
