import java.util.Scanner;

public class Ex03_12 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int n, novo;
        int t1 = 1;
        int t2 = 1; 

        System.out.print("Digite a Quantidade de Termos da Série de Fibonacci: ");
        n = leia.nextInt();

        System.out.print(t1 + " " + t2 + " ");
        for (int i = 3; i <= n; i++) {
            novo = t1 + t2;
            System.out.print(novo + " ");
            t1 = t2;
            t2 = novo;
        }

        leia.close();
    }
}
