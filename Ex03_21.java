import java.util.Scanner;

public class Ex03_21{
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int n, idade, soma = 0;

        System.out.print("Digite a Quantidade de Pessoas: ");
        n = leia.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Digite a Idade da " + i + "ª Pessoa: ");
            idade = leia.nextInt();
            soma += idade;
        }

        double media = soma / (double) n;

        if (media >= 0 && media <= 25) {
            System.out.println("Turma Jovem");
        } else if (media <= 60) {
            System.out.println("Turma Adulta");
        } else {
            System.out.println("Turma Idosa");
        }

        leia.close();
    }
}
