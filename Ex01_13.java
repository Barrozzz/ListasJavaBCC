import java.util.Scanner;

public class Ex01_13 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double peso, excesso, multa;
		double pesoLimite = 50.0;
		double multaKg = 4.0;

		System.out.print("Escreva o Peso dos Peixes em Quilos: \n");
		peso = leia.nextDouble();

		if (peso > pesoLimite) {
			excesso = peso - pesoLimite;
			multa = excesso * multaKg;
			System.out.print("Excesso de Peso: " + excesso + " Kg\n");
			System.out.print("Multa a Pagar: R$" + multa);
		} else {
			System.out.print("Não Houve Excesso");
		}

		leia.close();
	}
}
