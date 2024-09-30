import java.util.Scanner;

public class Ex04_04 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        char[] c = new char[10];
        int cont = 0;
        
        System.out.println("Digite 10 Caracteres: ");
        for (int i = 0; i < 9; i++) {
        	leia.nextLine();
            c[i] = leia.next().charAt(0);
            if (c[i] != 'a' && c[i] != 'e' && c[i] != 'i' && c[i] != 'o' && c[i] != 'u' &&
                c[i] != 'A' && c[i] != 'E' && c[i] != 'I' && c[i] != 'O' && c[i] != 'U') {
                cont++;
            }
        }
        
        System.out.print("\nConsoantes: \n| ");
        for (int i = 0; i < 9; i++) {
            if (c[i] != 'a' && c[i] != 'e' && c[i] != 'i' && c[i] != 'o' && c[i] != 'u' &&
                c[i] != 'A' && c[i] != 'E' && c[i] != 'I' && c[i] != 'O' && c[i] != 'U') {
                System.out.print(c[i] + " | ");
            }
        }
        System.out.println("\nTotal de Consoantes: " + cont);
        
        leia.close();
    }
}

