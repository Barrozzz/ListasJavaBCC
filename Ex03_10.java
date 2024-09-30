import java.util.Scanner;

public class Ex03_10 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int base, expoente;
        int resultado = 1;

        System.out.print("Digite a Base: ");
        base = leia.nextInt();
        System.out.print("Digite o Expoente: ");
        expoente = leia.nextInt();

        for (int i = 1; i <= expoente; i++) {
            resultado *= base;
        }

        System.out.println(base + "^" + expoente + " = " + resultado);
        leia.close();
    }
}
