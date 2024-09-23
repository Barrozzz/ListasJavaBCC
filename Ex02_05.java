import java.util.Scanner;

public class Ex02_05 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        char letra;

        System.out.print("Digite uma letra: ");
        letra = leia.next().toLowerCase().charAt(0);

        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' || letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U') {
            System.out.println("A letra é uma vogal");
        } else {
            System.out.println("A letra não é uma vogal");
        }

        leia.close();
    }
}
