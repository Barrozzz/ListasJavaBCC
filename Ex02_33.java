import java.util.Scanner;

public class Ex02_33 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		char respostaCerta[] = {'a', 'a', 'b', 'b', 'c', 'c', 'd', 'd', 'e', 'e'};
		char resposta[] = new char[10];
		int i;
		int pontos = 0;
		
		for(i = 0; i < 10; i++) {
			System.out.print("Resposta da Questão " + (i + 1) + ": ");
			resposta[i] = leia.nextLine().charAt(0);
		}
		for(i = 0; i < 10; i++) {
			if(resposta[i] == respostaCerta[i]) {
				System.out.print("\nQ" + (i + 1) + ": " + resposta[i] + ": Correta!");
				pontos++;
			} else {
				System.out.print("\nQ" + (i + 1) + ": " + resposta[i] + ": Errada, Resposta Correta (" + respostaCerta[i] + ")");
			}
		}
		System.out.print("\n\nPontuação Final: " + pontos);
	}
}
