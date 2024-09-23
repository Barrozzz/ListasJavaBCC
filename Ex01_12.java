import java.util.Scanner;

public class Ex01_12 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double altura, peso;
		char sexo;

		System.out.print("Escreva sua Altura em Metros: \n");
		altura = leia.nextDouble();
		leia.nextLine();
		
		System.out.print("M - Masculino / F - Feminino \n");
		sexo = leia.nextLine().charAt(0);

		if(sexo == 'M' || sexo == 'm') {
			peso = (72.7 * altura) - 58;
			System.out.print("Seu Peso Ideal é " + peso + " Kg");
		} else if (sexo == 'F' || sexo == 'f') {
			peso = (62.1 * altura) - 44.7;
			System.out.print("Seu Peso Ideal é " + peso + " Kg");
		} else {
			System.out.print("\nErro na Seleção do Sexo");
		}
		
		leia.close();
	}

}