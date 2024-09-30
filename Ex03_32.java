import java.util.Scanner;

public class Ex03_32 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int codigoCidade, veiculos, acidentes;
        int cidadeMaiorIndice = 0;
        int cidadeMenorIndice = 0;
        int somaVeiculos = 0;
        int somaAcidentesMenos2000 = 0;
        int cidadesMenos2000 = 0;
        double maiorIndice = 0;
        double menorIndice = 99999;
        double mediaVeiculos, mediaAcidentesMenos2000;
        double indiceAcidentes;
        
        for (int i = 1; i <= 5; i++) {
            System.out.println("Cidade Nº " + i + ":");
            System.out.print("Código da Cidade: ");
            codigoCidade = leia.nextInt();
            System.out.print("Número de Veículos de Passeio: ");
            veiculos = leia.nextInt();
            System.out.print("Número de Acidentes com Vítimas: ");
            acidentes = leia.nextInt();

            somaVeiculos += veiculos;
            
            indiceAcidentes = acidentes / veiculos;

            if (indiceAcidentes > maiorIndice) {
                maiorIndice = indiceAcidentes;
                cidadeMaiorIndice = codigoCidade;
            }
            if (indiceAcidentes < menorIndice) {
                menorIndice = indiceAcidentes;
                cidadeMenorIndice = codigoCidade;
            }

            if (veiculos < 2000) {
                somaAcidentesMenos2000 += acidentes;
                cidadesMenos2000++;
            }
        }

        mediaVeiculos = somaVeiculos / 5;
        if (cidadesMenos2000 > 0) {
            mediaAcidentesMenos2000 = somaAcidentesMenos2000 / cidadesMenos2000;
        } else {
            mediaAcidentesMenos2000 = 0;
        }

        System.out.println("\nMaior Índice de Acidentes: Cidade " + cidadeMaiorIndice + " com Índice " + maiorIndice);
        System.out.println("Menor Índice de Acidentes: Cidade " + cidadeMenorIndice + " com Índice " + menorIndice);
        System.out.println("Média de Veículos nas Cinco Cidades: " + mediaVeiculos);
        System.out.println("Média de Acidentes em Cidades com Menos de 2000 Veículos: " + mediaAcidentesMenos2000);

        leia.close();
    }
}
