import java.util.Scanner;

public class Ex02_02 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int valor;

        System.out.print("Digite um Valor: ");
        valor = leia.nextInt();

        if (valor > 0) {
            System.out.println("O Valor é Positivo");
        } else if (valor < 0) {
            System.out.println("O Valor é Negativo");
        } else {
            System.out.println("O Valor é Zero");
        }

        leia.close();
    }
}
