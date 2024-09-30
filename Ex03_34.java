import java.util.Scanner;

public class Ex03_34 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int numero;
        int cont0_25 = 0;
        int cont26_50 = 0;
        int cont51_75 = 0;
        int cont76_100 = 0;

        while (true) {
            System.out.print("Informe um Número: ");
            numero = leia.nextInt();

            if (numero < 0) {
            	break;
            }

            if (numero >= 0 && numero <= 25) {
                cont0_25++;
            } else if (numero >= 26 && numero <= 50) {
                cont26_50++;
            } else if (numero >= 51 && numero <= 75) {
                cont51_75++;
            } else if (numero >= 76 && numero <= 100) {
                cont76_100++;
            }
        }

        System.out.println("Quantidade no Intervalo [0-25]: " + cont0_25);
        System.out.println("Quantidade no Intervalo [26-50]: " + cont26_50);
        System.out.println("Quantidade no Intervalo [51-75]: " + cont51_75);
        System.out.println("Quantidade no Intervalo [76-100]: " + cont76_100);

        leia.close();
    }
}
