import java.util.Scanner;

public class Ex03_26{
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int pao;
        double precoPao;

        System.out.print("Informe o preço do pão: R$");
        precoPao = leia.nextDouble();
        pao = 1;

        System.out.println("'Panificadora Pão de Ontem' - Tabela de Preços: \n------------------------------------------------");
        while (pao <= 50) {
            System.out.println(pao + " - R$" + (pao * precoPao));
            pao++;
        }
        
        leia.close();
    }
}
