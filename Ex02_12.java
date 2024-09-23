import java.util.Scanner;

public class Ex02_12 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double salarioAtual, valorAumento, novoSalario;
        double percentualAumento = 0;

        System.out.print("Digite o Salário Atual do Colaborador: ");
        salarioAtual = leia.nextDouble();

        if (salarioAtual <= 280) {
            percentualAumento = 20;
        } else if (salarioAtual > 280 && salarioAtual <= 700) {
            percentualAumento = 15;
        } else if (salarioAtual > 700 && salarioAtual <= 1500) {
            percentualAumento = 10;
        } else if (salarioAtual > 1500) {
            percentualAumento = 5;
        }

        valorAumento = (percentualAumento / 100) * salarioAtual;
        novoSalario = salarioAtual + valorAumento;

        System.out.println("\nSalário Antes do Reajuste: R$" + salarioAtual);
        System.out.println("Percentual de Aumento: " + percentualAumento + "%");
        System.out.println("Valor do Aumento: R$" + valorAumento);
        System.out.println("Novo Salário: R$" + novoSalario);

        leia.close();
    }
}
