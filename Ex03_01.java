import java.util.Scanner;

public class Ex03_01 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int nota;

        do {
            System.out.print("Digite uma Nota Entre 0 e 10: ");
            nota = leia.nextInt();
            if (nota < 0 || nota > 10) {
                System.out.println("Nota Inválida! Tente Novamente\n");
            }
        } while (nota < 0 || nota > 10);

        System.out.println("\nNota Válida: " + nota);
        
        leia.close();
    }
}
