import java.util.Scanner;

public class Ex02_06 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int numero;

        System.out.print("Digite um Número Inteiro: ");
        numero = leia.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O Número é Par, Transformado em Ímpar: " + (numero - 1) + " ou " + (numero + 1));
        } else {
            System.out.println("O Número é Ímpar, Transformado em Par: " + (numero - 1) + " ou " + (numero + 1));
        }

        leia.close();
    }
}

