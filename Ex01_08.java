import java.util.Scanner;

public class Ex01_08 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		float ganho, horas;
		
		System.out.print("Escreva Quanto Você Ganha por Hora: \n");
		ganho = leia.nextFloat();
		System.out.print("Escreva Quantas Horas Você Trabalha por Mês: \n");
		horas = leia.nextFloat();
		System.out.print("O seu Salário no Mês é R$" + ganho * horas);
		
		leia.close();
	}

}