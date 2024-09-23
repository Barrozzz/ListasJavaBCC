import java.util.Scanner;

public class Ex01_04 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		float n1, n2, n3, n4, m;
		
		System.out.print("Escreva a Primeira Nota: \n");
		n1 = leia.nextFloat();
		System.out.print("Escreva a Segunda Nota: \n");
		n2 = leia.nextFloat();
		System.out.print("Escreva a Terceira Nota: \n");
		n3 = leia.nextFloat();
		System.out.print("Escreva a Quarta Nota: \n");
		n4 = leia.nextFloat();
		
		m = (n1 + n2 + n3 + n4) / 4;
		
		System.out.print("A Média Bimestral é " + m);
		
		leia.close();
	}

}


