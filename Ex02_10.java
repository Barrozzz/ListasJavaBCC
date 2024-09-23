import java.util.Scanner;

public class Ex02_10 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int num1, num2, num3;

        System.out.print("Digite o Primeiro Número: ");
        num1 = leia.nextInt();
        System.out.print("Digite o Segundo Número: ");
        num2 = leia.nextInt();
        System.out.print("Digite o Terceiro Número: ");
        num3 = leia.nextInt();
        System.out.print("\n");

        if (num1 >= num2 && num1 >= num3) {
            if (num2 >= num3) {
                System.out.println("Maior: " + num1 + "\nMenor: " + num3);
            } else {
                System.out.println("Maior: " + num1 + "\nMenor: " + num2);
            }
        } else if (num2 >= num1 && num2 >= num3) {
            if (num1 >= num3) {
                System.out.println("Maior: " + num1 + "\nMenor: " + num3);
            } else {
                System.out.println("Maior: " + num2 + "\nMenor: " + num1);
            }
        } else {
            if (num1 >= num2) {
                System.out.println("Maior: " + num1 + "\nMenor: " + num2);
            } else {
                System.out.println("Maior: " + num3 + "\nMenor: " + num1);
            }
        }

        leia.close();
    }
}
