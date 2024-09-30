import java.util.Scanner;

public class Ex03_07 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int n1, n2;

        System.out.print("Digite o Primeiro Valor: ");
        n1 = leia.nextInt();
        System.out.print("Digite o Segundo Valor: ");
        n2 = leia.nextInt();
        
        if (n1 < n2) {
        	for (int i = (n1 + 1); i < n2; i++) {
        		System.out.print(i + " | ");
        	}
        } else if (n2 < n1) {
        	for (int i = n2 + 1; i < n1; i++) {
        		System.out.print(i + " | ");
        	}
        } else {
        	System.out.print("\nSão o Mesmo Valor");
        }

        leia.close();
    }
}
