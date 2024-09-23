import java.util.Scanner;

public class Ex02_28 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double n1, n2, r;
        char operacao;

        System.out.print("Digite o Primeiro Número: ");
        n1 = leia.nextDouble();
        System.out.print("Digite o Segundo Número: ");
        n2 = leia.nextDouble();
        
        leia.nextLine();
        System.out.print("\nEscolha a Operação (+, -, *, /): ");
        operacao = leia.next().charAt(0);

        switch (operacao) {
            case '+':
                r = n1 + n2;
                break;
            case '-':
                r = n1 - n2;
                break;
            case '*':
                r = n1 * n2;
                break;
            case '/':
                r = n1 / n2;
                break;
            default:
                System.out.print("Operação Inválida");
                leia.close();
                return;
        }

        System.out.println("Resultado: " + r);

        if (r % 2 == 0) {
            System.out.println("Par ");
        } else {
            System.out.print("Ímpar ");
        }

        if (r >= 0) {
            System.out.print("| Positivo ");
        } else {
            System.out.print("| Negativo ");
        }

        if (r == Math.floor(r)) {
            System.out.print("| Inteiro ");
        } else {
            System.out.print("| Decimal ");
        }

        leia.close();
    }
}
