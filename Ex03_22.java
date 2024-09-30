import java.util.Scanner;

public class Ex03_22 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int votantes, voto, c1 = 0, c2 = 0, c3 = 0;

        System.out.print("Digite o Número de Votantes: ");
        votantes = leia.nextInt();

        for (int i = 1; i <= votantes; i++) {
            do {
                System.out.print("Voto do " + i + "º Votante:| 1 | 2 | 3 |\n");
                voto = leia.nextInt();
            } while (voto < 1 || voto > 3);

            switch (voto) {
                case 1: 
                	c1++; 
                	break;
                case 2: 
                	c2++;
                	break;
                case 3: 
                	c3++; 
                	break;
            }
        }

        System.out.println("\nCandidato 1: " + c1 + " Voto(s)");
        System.out.println("Candidato 2: " + c2 + " Voto(s)");
        System.out.println("Candidato 3: " + c3 + " Voto(s)");
        leia.close();
    }
}
