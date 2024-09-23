import java.util.Scanner;

public class Ex01_09 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double temp, celcius;
		
		System.out.print("Escreva os Graus em Farenheit: \n");
		temp = leia.nextDouble();
		
		celcius = (5 * (temp-32) / 9);
		
		System.out.print("A Temperatura Convertida é de " + celcius + "°C");
		
		leia.close();
	}

}