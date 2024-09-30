import java.util.Scanner;

public class Ex04_01 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int[] numeros = new int[5];
        
        System.out.println("Digite 5 Números Inteiros: ");
        for (int i = 0; i < 5; i++) {
            numeros[i] = leia.nextInt();
        }
        
        System.out.println("\nNúmeros Digitados: ");
        for (int i = 0; i < 5; i++) {
            System.out.println(numeros[i]);
        }
        
        leia.close();
    }
}
