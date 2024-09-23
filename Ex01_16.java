import java.util.Scanner;

public class Ex01_16 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double area, litrosNecessarios, latasNecessarias, galoesNecessarios, precoLatas, precoGaloes;
		
		System.out.print("Escreva o Tamanho da Área a ser Pintada em Metros Quadrados: \n");
		area = leia.nextDouble();

		litrosNecessarios = area / 6.0;

		latasNecessarias = Math.ceil(litrosNecessarios / 18.0);
		precoLatas = latasNecessarias * 80.0;

		galoesNecessarios = Math.ceil(litrosNecessarios / 3.6); 
		precoGaloes = galoesNecessarios * 25.0;

		System.out.println("\nSituação 1 - Comprar Apenas Latas de 18 L");
		System.out.println("Quantidade de latas necessárias: " + latasNecessarias);
		System.out.println("Preço total: R$" + precoLatas);

		System.out.println("\nSituação 2 - Comprar Apenas Galões de 3,6 L");
		System.out.println("Quantidade de galões necessários: " + galoesNecessarios);
		System.out.println("Preço total: R$" + precoGaloes);

		leia.close();
	}
}
