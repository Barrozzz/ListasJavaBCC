import java.util.Scanner;

public class Ex02_19 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double a, b, c, delta, r1, r2;

        System.out.print("Digite o Valor de A: ");
        a = leia.nextDouble();

        if (a == 0) {
            System.out.println("A Equação Não é do Segundo Grau");
            leia.close();
            return;
        }

        System.out.print("Digite o Valor de B: ");
        b = leia.nextDouble();
        System.out.print("Digite o Valor de C: ");
        c = leia.nextDouble();

        delta = (b * b) - (4 * a * c);

        if (delta < 0) {
            System.out.println("A Equação não Possui Raízes Reais");
        } else if (delta == 0) {
            r1 = -b / (2 * a);
            System.out.println("A Equação Possui uma Raiz Real: " + r1);
        } else {
            r1 = (-b + Math.sqrt(delta)) / (2 * a);
            r2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("A Equação Possui Duas Raízes Reais: " + r1 + " e " + r2);
            
        }
        
        leia.close();
    }
}
