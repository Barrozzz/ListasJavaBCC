import java.util.Scanner;

public class Ex03_08 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int n1, n2;
        int soma = 0;
        
        System.out.print("Digite o Primeiro Valor: ");
        n1 = leia.nextInt();
        System.out.print("Digite o Segundo Valor: ");
        n2 = leia.nextInt();
        
        if (n1 < n2) {
        	for (int i = (n1 + 1); i < n2; i++) {
        		soma += i;
        	}
        } else if (n2 < n1) {
        	for (int i = n2 + 1; i < n1; i++) {
        		soma += i;
        	}
        } else {
        	System.out.print("\nSão o Mesmo Valor, ");
        }
        	System.out.print("Valor da Soma: " + soma);
        leia.close();
    }
}