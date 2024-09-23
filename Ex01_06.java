import java.util.Scanner;

public class Ex01_06 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double raio, area;
		
		System.out.print("Escreva o Raio do Círculo: \n");
		raio = leia.nextDouble();
		
		area = Math.PI * raio * raio;
		
		System.out.print("A Área do Círculo é " + area);
		
		leia.close();
	}

}