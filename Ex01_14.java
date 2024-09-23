import java.util.Scanner;

public class Ex01_14 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double ganhoPorHora, horasTrabalhadas, salarioBruto, ir, inss, sind, salarioLiquido;

		System.out.print("Escreva Quanto Você Ganha por Hora: R$");
		ganhoPorHora = leia.nextDouble();
		System.out.print("Escreva Quantas Horas Você Trabalha no Mês: \n");
		horasTrabalhadas = leia.nextDouble();
		
		salarioBruto = ganhoPorHora * horasTrabalhadas;
		ir = salarioBruto * 0.11;
		inss = salarioBruto * 0.08;
		sind = salarioBruto * 0.05;
		salarioLiquido = salarioBruto - (ir + inss + sind);
		
		System.out.println("\n+ Salário Bruto: R$" + salarioBruto);
		System.out.println("- IR (11%): R$" + ir);
		System.out.println("- INSS (8%): R$" + inss);
		System.out.println("- Sindicato (5%): R$" + sind);
		System.out.println("__________________________\n= Salário Líquido: R$" + salarioLiquido);

		leia.close();
	}

}