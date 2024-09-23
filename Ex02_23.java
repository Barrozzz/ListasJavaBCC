import java.util.Scanner;

public class Ex02_23 {
    public static void main(String[] args) {
        int id1, id2, id3;
        float m;
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite a Primeira Idade: ");
        id1 = leia.nextInt();
        System.out.print("Digite a Segunda Idade: ");
        id2 = leia.nextInt();
        System.out.print("Digite a Terceira Idade: ");
        id3 = leia.nextInt();

        m = (id1 + id2 + id3) / 3;

        if (m < 25) {
            System.out.println("Turma Jovem");
        } else if (m >= 25 && m <= 40) {
            System.out.println("Turma Adulta");
        } else {
            System.out.println("Turma Idosa");
        }

        leia.close();
    }
}
