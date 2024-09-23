import java.util.Scanner;

public class Ex01_15 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double area, litrosNecessarios, latasNecessarias, precoTotal;

		System.out.print("Escreva o Tamanho da Área a ser Pintada em Metros Quadrados: \n");
		area = leia.nextDouble();

		litrosNecessarios = area / 3.0;
		latasNecessarias = Math.ceil(litrosNecessarios / 18.0);
		precoTotal = latasNecessarias * 80.0;
		
		System.out.println("\nQuantidade de latas necessárias: " + latasNecessarias);
		System.out.println("Preço total: R$" + precoTotal);

		leia.close();
	}

}
