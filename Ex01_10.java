import java.util.Scanner;

public class Ex01_10 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int num1, num2;
		float num3, p1, p2, p3;
		
		System.out.print("Escreva o Primeiro Número: \n");
		num1 = leia.nextInt();
		System.out.print("Escreva o Segundo Número: \n");
		num2 = leia.nextInt();
		System.out.print("Escreva o Terceiro Número: \n");
		num3 = leia.nextFloat();
		p1 = num1 * 2 + num2 / 2;
		p2 = num1 * 3 + num3;
		p3 = num3 * num3 * num3;
		System.out.print("O Produto do Dobro do Primeiro com Metade do Segundo: " + p1);
		System.out.print("\nA Soma do Triplo do Primeiro com o Terceiro: " + p2);
		System.out.print("\nO Terceiro Elevado ao Cubo: " + p3);
		
		
		leia.close();
	}

}