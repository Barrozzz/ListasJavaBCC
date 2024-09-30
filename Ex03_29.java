import java.util.Scanner;

public class Ex03_29 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in); 
        int n, inicio, fim, i;
        
        System.out.print("Montar a Tabuada de: ");
        n = leia.nextInt();
        
        System.out.print("Começar por: ");
        inicio = leia.nextInt();
        
        System.out.print("Terminar em: ");
        fim = leia.nextInt();
        
        i = inicio;
        
        if (fim < inicio) {
            System.out.println("\nO Valor Final deve ser Maior ou Igual ao Inicial");
        } else {
            while (i <= fim) {
                System.out.println(n + " x " + i + " = " + (n * i));
                i++;
            }
        }
        
        leia.close();
    }
}
