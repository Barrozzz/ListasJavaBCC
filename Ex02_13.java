import java.util.Scanner;

public class Ex02_13 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double valorHora, salarioBruto, salarioLiq, fgts, inss, sindicato, totalDesc;
        double ir = 0;
        int horasTrab;

        System.out.print("Informe o Valor da sua Hora de Trabalho: R$");
        valorHora = leia.nextDouble();

        System.out.print("Informe a Quantidade de Horas Trabalhadas no Mês: ");
        horasTrab = leia.nextInt();

        salarioBruto = valorHora * horasTrab;

        if (salarioBruto <= 900) {
            ir = 0;
        } else if (salarioBruto <= 1500) {
            ir = 0.05 * salarioBruto;
        } else if (salarioBruto <= 2500) {
            ir = 0.10 * salarioBruto;
        } else {
            ir = 0.20 * salarioBruto;
        }

        inss = 0.10 * salarioBruto;
        sindicato = 0.03 * salarioBruto;
        fgts = 0.11 * salarioBruto;

        totalDesc = ir + inss;

        salarioLiq = salarioBruto - totalDesc;

        System.out.println("Salário Bruto: R$" + salarioBruto);
        System.out.println("- IR : R$" + ir);
        System.out.println("- INSS (10%) : R$" + inss);
        System.out.println("- Total de Descontos : R$" + totalDesc);
        System.out.println("_________________________________\nSalário Líquido : R$" + salarioLiq);
        System.out.println("FGTS (11%) : R$" + fgts);
        System.out.println("Sindicato (3%) : R$" + sindicato);

        leia.close();
    }
}

