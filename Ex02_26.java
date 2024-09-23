import java.util.Scanner;

public class Ex02_26 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int n;
		
		System.out.print("Escreva o Número: \n");
		n = leia.nextInt();
		
		if(n % 2 == 0) {
			System.out.print("\nO Número é Par");
		} else {
			System.out.print("\nO Número é Ímpar");
		}
		
		leia.close();
	}

}
