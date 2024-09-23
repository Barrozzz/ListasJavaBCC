import java.util.Scanner;

public class Ex02_03 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        char sexo;

        System.out.print("Digite F - Feminino ou M - Masculino: ");
        sexo = leia.next().charAt(0);

        if (sexo == 'F' || sexo == 'f') {
            System.out.println("Feminino");
        } else if (sexo == 'M' || sexo == 'm') {
            System.out.println("Masculino");
        } else {
            System.out.println("Ocorreu um Erro");
        }

        leia.close();
    }
}
