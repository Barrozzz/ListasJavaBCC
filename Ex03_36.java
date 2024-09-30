import java.util.Scanner;

public class Ex03_36 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int voto;
        int votosCandidato1 = 0;
        int votosCandidato2 = 0;
        int votosCandidato3 = 0; 
        int votosCandidato4 = 0;
        int votosNulos = 0;
        int votosBrancos = 0;
        int totalVotos = 0;

        while (true) {
            System.out.print("Informe o Código do Voto: ");
            voto = leia.nextInt();

            if (voto == 0) {
            	break;
            }

            totalVotos++;

            switch (voto) {
                case 1:
                    votosCandidato1++;
                    break;
                case 2:
                    votosCandidato2++;
                    break;
                case 3:
                    votosCandidato3++;
                    break;
                case 4:
                    votosCandidato4++;
                    break;
                case 5:
                    votosNulos++;
                    break;
                case 6:
                    votosBrancos++;
                    break;
                default:
                    System.out.println("Voto Inválido");
            }
        }

        System.out.println("\nCandidato 1: " + votosCandidato1);
        System.out.println("Candidato 2: " + votosCandidato2);
        System.out.println("Candidato 3: " + votosCandidato3);
        System.out.println("Candidato 4: " + votosCandidato4);
        System.out.println("Votos Nulos: " + votosNulos);
        System.out.println("Votos em Branco: " + votosBrancos);
        System.out.println("Percentual de Votos Nulos: " + (votosNulos * 100.0 / totalVotos) + "%");
        System.out.println("Percentual de Votos em Branco: " + (votosBrancos * 100.0 / totalVotos) + "%");

        leia.close();
    }
}
