import java.util.Scanner;

public class Ex03_13 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int n;
        int fat = 1;

        System.out.print("Digite um Número para Calcular o Fatorial: ");
        n = leia.nextInt();
        
        System.out.print(n + "! = 1");
        
        for (int i = 2; i <= n; i++) {
            fat *= i;
            System.out.print(" * " + i);
        }

        System.out.print(" = " + fat);
        leia.close();
    }
}
