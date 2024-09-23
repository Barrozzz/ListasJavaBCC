import java.util.Scanner;

public class Ex02_09 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double altura, pesoIdeal, pesoAtual;
        char sexo;

        System.out.print("Digite sua Altura em Metros: ");
        altura = leia.nextDouble();
        System.out.print("Digite seu Peso Atual: ");
        pesoAtual = leia.nextDouble();
        leia.nextLine();
        System.out.print("Digite F - Feminino ou M - Masculino: ");
        sexo = leia.nextLine().charAt(0);

        if (sexo == 'M' || sexo == 'm') {
            pesoIdeal = (72.7 * altura) - 58;
        } else if (sexo == 'F' || sexo == 'f') {
            pesoIdeal = (62.1 * altura) - 44.7;
        } else {
            System.out.println("Ocorreu um Erro");
            leia.close();
            return;
        }

        System.out.println("\nAltura: " + altura);
        System.out.println("Peso Atual: " + pesoAtual);
        System.out.println("Peso Ideal: " + pesoIdeal);

        if (pesoAtual > pesoIdeal) {
            System.out.println("Você Está Acima do Peso Ideal");
        } else if (pesoAtual < pesoIdeal) {
            System.out.println("Você Está Abaixo do Peso Ideal.");
        } else {
            System.out.println("Você Está no Peso Ideal.");
        }

        leia.close();
    }
}