import java.util.Scanner;

public class Ex01_07 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double lado, area;
		
		System.out.print("Escreva o Lado do Quadrado: \n");
		lado = leia.nextDouble();
		
		area = lado * lado;
		
		System.out.print("A Área do Quadrado é " + area);
		
		leia.close();
	}

}