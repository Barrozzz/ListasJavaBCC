import java.util.Scanner;

public class Ex02_04 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int ano;

        System.out.print("Digite um Ano com 4 Dígitos: ");
        ano = leia.nextInt();

        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            System.out.println(ano + " é um ano Bissexto");
        } else {
            System.out.println(ano + " não é um ano Bissexto");
        }

        leia.close();
    }
}

