import java.util.Scanner;

public class Ex04_02 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double[] numeros = new double[10];
        
        System.out.println("Digite 10 Números Reais: ");
        for (int i = 0; i < 10; i++) {
            numeros[i] = leia.nextDouble();
        }
        
        System.out.println("\nNúmeros em Ordem Inversa: ");
        for (int i = 9; i >= 0; i--) {
            System.out.println(numeros[i]);
        }
        
        leia.close();
    }
}
