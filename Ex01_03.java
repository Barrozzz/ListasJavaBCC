import java.util.Scanner;

public class Ex01_03 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int num1, num2;
		
		System.out.print("Escreva o Primeiro Número: \n");
		num1 = leia.nextInt();
		System.out.print("Escreva o Segundo Número: \n");
		num2 = leia.nextInt();
		System.out.print("A Soma é " + (num1+num2));
		
		leia.close();
	}

}

