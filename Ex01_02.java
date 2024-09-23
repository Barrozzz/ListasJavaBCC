import java.util.Scanner;

public class Ex01_02 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int num;
		
		System.out.print("Escreva um Número: \n");
		num = leia.nextInt();
		System.out.print("O Número Informado foi " + num);
		
		leia.close();
	}

}
