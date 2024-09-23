import java.util.Scanner;

public class Ex02_17 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        float n1, n2, m;
        char conceito;

        System.out.print("Digite a Primeira Nota: ");
        n1 = leia.nextFloat();
        System.out.print("Digite a Segunda Nota: ");
        n2 = leia.nextFloat();

        m = (n1 + n2) / 2;

        if (m >= 9) {
            conceito = 'A';
        } else if (m >= 7.5) {
            conceito = 'B';
        } else if (m >= 6) {
            conceito = 'C';
        } else if (m >= 4) {
            conceito = 'D';
        } else {
            conceito = 'E';
        }
        
        if (conceito == 'A' || conceito == 'B' || conceito == 'C') {
            System.out.println("\nAprovado com Nota: " + conceito);
        } else if (conceito == 'D' || conceito == 'E'){
            System.out.println("\nReprovado com Nota: " + conceito);
        } else {
        	System.out.println("\nOcorreu um Erro");
        }

        leia.close();
    }
}