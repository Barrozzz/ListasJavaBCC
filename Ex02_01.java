import java.util.Scanner;

public class Ex02_01 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int num1, num2;
		
		System.out.print("Escreva o Primeiro Número: \n");
		num1 = leia.nextInt();
		System.out.print("Escreva o Segundo Número: \n");
		num2 = leia.nextInt();
		if(num1 > num2) {
			System.out.print(num1 + " é Maior que " + num2);
		} else if(num1 < num2) {
			System.out.print(num2 + " é Maior que " + num1);
		} else {
			System.out.print("Ambos os Números são " + num1);
		}
		
		leia.close();
	}

}
