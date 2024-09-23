import java.util.Scanner;

public class OlaMundo {

	public static void main(String[] args){

		int opcao;
		String nome;
		int num1 = 1;
		float num2 = 2.45f;
		double num3 = 23.039;
		char letra = 'E';
		String palavra = "top";
		boolean escolha = true;

		Scanner leia = new Scanner(System.in);

		System.out.print("1 - Olá Mundo / 2 - Olá (Seu Nome) / 3 - Testes\n");
		opcao = leia.nextInt();

		if(opcao == 1) {
			System.out.print("Olá Mundo!");
		} else if (opcao == 2) {
			System.out.print("Escreva seu Nome: ");
			nome = leia.next();
			System.out.print("Olá " + nome + "!");
		} else {
			System.out.print("Resto dos Pedidos de Teste: \n" + num1 + "\n" + num2 + "\n" + num3 + "\n" + palavra +  "\n" + letra + "\n" + escolha);
			num1 = leia.nextInt();
			System.out.print("\n");
			num2 = leia.nextFloat();
			System.out.print("\n");
			num3 = leia.nextDouble();
			leia.nextLine();
			System.out.print("\n");
			palavra = leia.nextLine();
			System.out.print("\n");
			letra = leia.nextLine().charAt(0);
			System.out.print("\n" + num1 + "\n" + num2 + "\n" + num3 + "\n" + palavra +  "\n" + letra + "\n" + escolha);

		}

		leia.close();
	}

}
