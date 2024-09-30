import java.util.Scanner;

public class Ex04_03 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double[] notas = new double[4];
        double soma = 0;
        
        System.out.println("Digite 4 Notas: ");
        for (int i = 0; i < 4; i++) {
            notas[i] = leia.nextDouble();
            soma += notas[i];
        }
        
        double media = soma / notas.length;
        System.out.println("\nNotas: ");
        for (double nota : notas) {
            System.out.println(nota);
        }
        
        System.out.println("\nMédia: " + media);
        
        leia.close();
    }
}
