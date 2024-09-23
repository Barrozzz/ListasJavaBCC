import java.util.Scanner;

public class Ex01_11 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double altura, peso;
		
		System.out.print("Escreva sua Altura em Metros: \n");
		altura = leia.nextDouble();
		
		peso = (72.7 * altura) - 58;
		
		System.out.print("Seu Peso Ideal é " + peso + " Kg");
		
		leia.close();
	}

}