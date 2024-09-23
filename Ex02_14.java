import java.util.Scanner;

public class Ex02_14 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int dia;

        System.out.print("Digite um Número de 1 a 7 para o Dia da Semana: ");
        dia = leia.nextInt();

        switch (dia){
            case 1: System.out.print("Domingo"); break;
            case 2: System.out.print("Segunda"); break;
            case 3: System.out.print("Terça"); break;
            case 4: System.out.print("Quarta"); break;
            case 5: System.out.print("Quinta"); break;
            case 6: System.out.print("Sexta"); break;
            case 7: System.out.print("Sábado"); break;
            default: System.out.print("Valor Inválido."); break;
        }

        leia.close();
    }
}
