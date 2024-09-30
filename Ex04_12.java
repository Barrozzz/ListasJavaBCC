import java.util.Scanner;

public class Ex04_12 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int[] idades = new int[5];
        float[] alturas = new float[5];

        int maisVelho = 0;
        int maisNovo = 0;
        float maisAlto = 0;
        float maisBaixo = 0;
        int indiceMaisVelho = 0;
        int indiceMaisNovo = 0;
        int indiceMaisAlto = 0;
        int indiceMaisBaixo = 0;
        float somaIdade = 0;
        float somaAltura = 0;
        
        for (int i = 0; i < 5; i++) {
            System.out.print("Informe a Idade da Pessoa " + (i + 1) + ": ");
            idades[i] = leia.nextInt();
            System.out.print("Informe a Altura da Pessoa " + (i + 1) + " (em m): ");
            alturas[i] = leia.nextFloat();
            
            somaIdade += idades[i];
            somaAltura += alturas[i];

            if (i == 0) {
                maisVelho = idades[i];
                maisNovo = idades[i];
                maisAlto = alturas[i];
                maisBaixo = alturas[i];
            }

            if (idades[i] > maisVelho) {
                maisVelho = idades[i];
                indiceMaisVelho = i;
            }
            if (idades[i] < maisNovo) {
                maisNovo = idades[i];
                indiceMaisNovo = i;
            }
            if (alturas[i] > maisAlto) {
                maisAlto = alturas[i];
                indiceMaisAlto = i;
            }
            if (alturas[i] < maisBaixo) {
                maisBaixo = alturas[i];
                indiceMaisBaixo = i;
            }
        }

        System.out.println("\nIdades e Alturas: ");
        for (int i = 4; i >= 0; i--) {
            System.out.println("Pessoa " + (i + 1) + " - Idade: " + idades[i] + ", Altura: " + alturas[i] + "m");
        }

        float mediaIdade = somaIdade / 5;
        float mediaAltura = somaAltura / 5;

        System.out.println("\nMais Velho: Pessoa " + (indiceMaisVelho + 1) + " - Idade: " + maisVelho);
        System.out.println("Mais Novo: Pessoa " + (indiceMaisNovo + 1) + " - Idade: " + maisNovo);
        System.out.println("Mais Alto: Pessoa " + (indiceMaisAlto + 1) + " - Altura: " + maisAlto + "m");
        System.out.println("Mais Baixo: Pessoa " + (indiceMaisBaixo + 1) + " - Altura: " + maisBaixo + "m");

        System.out.println("\nPessoas Abaixo da Média de Idade e Altura: ");
        for (int i = 0; i < 5; i++) {
            if (idades[i] < mediaIdade || alturas[i] < mediaAltura) {
                System.out.println("Pessoa " + (i + 1) + " - Idade: " + idades[i] + ", Altura: " + alturas[i] + "m");
            }
        }

        System.out.println("\nPessoas Acima da Média de Idade e Altura: ");
        for (int i = 0; i < 5; i++) {
            if (idades[i] > mediaIdade || alturas[i] > mediaAltura) {
                System.out.println("Pessoa " + (i + 1) + " - Idade: " + idades[i] + ", Altura: " + alturas[i] + "m");
            }
        }

        leia.close();
    }
}
