import java.util.Scanner;

public class Ex03_04 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int anos = 0;
        double populacaoA, populacaoB, taxaA, taxaB;

        do {
            System.out.print("\nDigite a População do País A (Maior que 0): ");
            populacaoA = leia.nextDouble();
        } while (populacaoA <= 0);

        do {
            System.out.print("\nDigite a População do País B (Maior que 0): ");
            populacaoB = leia.nextDouble();
        } while (populacaoB <= 0);

        do {
            System.out.print("\nDigite a Taxa de Crescimento do País A (%): ");
            taxaA = leia.nextDouble();
        } while (taxaA <= 0);

        do {
            System.out.print("\nDigite a Taxa de Crescimento do País B (%): ");
            taxaB = leia.nextDouble();
        } while (taxaB <= 0);

        if (populacaoA < populacaoB) {
            populacaoA += populacaoA * (taxaA / 100);
            populacaoB += populacaoB * (taxaB / 100);
            anos++;
            System.out.println("\n" + anos + " Ano(s) para a População do País A Ultrapassar ou Igualar a do País B");
        }
        
        if (populacaoA > populacaoB) {
            populacaoA += populacaoA * (taxaA / 100);
            populacaoB += populacaoB * (taxaB / 100);
            anos++;
            System.out.println("\n" + anos + " Ano(s) para a População do País B Ultrapassar ou Igualar a do País A");
        }

        leia.close();
    }
}
