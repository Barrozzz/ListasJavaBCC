import java.util.Scanner;

public class Ex01_05 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		float met, cent;
		
		System.out.print("Escreva a Medida em Metros: \n");
		met = leia.nextFloat();
		
		cent = met * 100;
		
		System.out.print("A Medida em Centímetros é " + cent);
		
		leia.close();
	}

}

