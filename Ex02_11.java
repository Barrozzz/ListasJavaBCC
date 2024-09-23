import java.util.Scanner;

public class Ex02_11 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        char turno;

        System.out.print("Digite o Turno que Você Estuda (M - Matutino | V - Vespertino | N - Noturno): ");
        turno = leia.nextLine().charAt(0);

        if (turno == 'M' || turno == 'm') {
            System.out.println("Bom Dia!");
        } else if (turno == 'V' || turno == 'v') {
            System.out.println("Boa Tarde!");
        } else if (turno == 'N' || turno == 'n') {
            System.out.println("Boa Noite!");
        } else {
            System.out.println("Ocorreu um Erro");
        }

        leia.close();
    }
}