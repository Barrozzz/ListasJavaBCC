import java.util.Scanner;

public class Ex02_18 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int l1, l2, l3;

        System.out.print("Digite o Primeiro Lado: ");
        l1 = leia.nextInt();
        System.out.print("Digite o Segundo Lado: ");
        l2 = leia.nextInt();
        System.out.print("Digite o Terceiro Lado: ");
        l3 = leia.nextInt();

        if ((l1 + l2 > l3) && (l1 + l3 > l2) && (l2 + l3 > l1)) {
            if (l1 == l2 && l2 == l3) {
                System.out.println("\nTriângulo Equilátero");
            } else if (l1 == l2 || l1 == l3 || l2 == l3) {
                System.out.println("\nTriângulo Isósceles");
            } else {
                System.out.println("\nTriângulo Escaleno");
            }
        } else {
            System.out.println("Os Valores Não Formam um Triângulo");
        }

        leia.close();
    }
}