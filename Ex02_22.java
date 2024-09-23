import java.util.Scanner;

public class Ex02_22 {
    public static void main(String[] args) {
        int n, centenas, dezenas, unidades;
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite um Número Inteiro Menor que 1000: ");
        n = leia.nextInt();

        centenas = n / 100;
        dezenas = (n % 100) / 10;
        unidades = n % 10;

        System.out.println(n + " = " + centenas + " centenas, " + dezenas + " dezenas e " + unidades + " unidades");
        
        leia.close();
    }
}
