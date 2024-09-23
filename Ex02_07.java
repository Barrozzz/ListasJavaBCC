import java.util.Scanner;

public class Ex02_07 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int num1, num2, num3;

        System.out.print("Digite o Primeiro Número: ");
        num1 = leia.nextInt();
        System.out.print("Digite o Segundo Número: ");
        num2 = leia.nextInt();
        System.out.print("Digite o Terceiro Número: ");
        num3 = leia.nextInt();
        System.out.print("\nEm Ordem Decrescente: ");

        if (num1 >= num2 && num1 >= num3) {
            if (num2 >= num3) {
                System.out.println(num1 + ", " + num2 + " e " + num3);
            } else {
                System.out.println(num1 + ", " + num3 + " e " + num2);
            }
        } else if (num2 >= num1 && num2 >= num3) {
            if (num1 >= num3) {
                System.out.println(num2 + ", " + num1 + " e " + num3);
            } else {
                System.out.println(num2 + ", " + num3 + " e " + num1);
            }
        } else {
            if (num1 >= num2) {
                System.out.println(num3 + ", " + num1 + " e " + num2);
            } else {
                System.out.println(num3 + ", " + num2 + " e " + num1);
            }
        }

        leia.close();
    }
}
