import java.util.Scanner;

public class Ex03_30 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);     
        int codigo, maisAlto, maisBaixo, maisGordo, maisMagro, cont;
        double altura, peso, maiorAltura, menorAltura, maiorPeso, menorPeso, somaAlturas, somaPesos, mediaAlturas, mediaPesos;

        maisAlto = 0;
        maisBaixo = 0;
        maisGordo = 0;
        maisMagro = 0; 
        cont = 0;
        maiorAltura = 0;
        menorAltura = 9.99;
        maiorPeso = 0;
        menorPeso = 999;
        somaAlturas = 0;
        somaPesos = 0;
        
        while (true) {
            System.out.print("\nInforme o Código do Cliente: ");
            codigo = leia.nextInt();
            if (codigo == 0) break;
            
            System.out.print("Informe a Altura (Metros): ");
            altura = leia.nextDouble();
            System.out.print("Informe o Peso (Kg): ");
            peso = leia.nextDouble();
            
            somaAlturas += altura;
            somaPesos += peso;
            cont++;
            
            if (altura > maiorAltura) {
                maiorAltura = altura;
                maisAlto = codigo;
            }
            if (altura < menorAltura) {
                menorAltura = altura;
                maisBaixo = codigo;
            }
            if (peso > maiorPeso) {
                maiorPeso = peso;
                maisGordo = codigo;
            }
            if (peso < menorPeso) {
                menorPeso = peso;
                maisMagro = codigo;
            }
        }
        
        if (cont > 0) {
            mediaAlturas = somaAlturas / cont;
            mediaPesos = somaPesos / cont;
            
            System.out.println("\nCliente Mais Alto (Código: " + maisAlto + "): " + maiorAltura + "m");
            System.out.println("Cliente Mais Baixo (Código: " + maisBaixo + "): " + menorAltura + "m");
            System.out.println("Cliente Mais Gordo (Código: " + maisGordo + "): " + maiorPeso + "Kg");
            System.out.println("Cliente Mais Magro (Código: " + maisMagro + "): " + menorPeso + "Kg");
            System.out.println("\nMédia de Alturas: " + mediaAlturas + "m");
            System.out.println("Média de Pesos: " + mediaPesos + "Kg");
        } else {
            System.out.println("\nNenhum Cliente foi Registrado");
        }
        
        leia.close();
    }
}
