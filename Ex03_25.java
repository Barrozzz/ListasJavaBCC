import java.util.Scanner;

public class Ex03_25 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);     
        int produto;
        double precoProduto;

        produto = 1;
        precoProduto = 1.99;
        
        System.out.println("'Lojas Quase Dois' - Tabela de Preços: \n--------------------------------------");
        while (produto <= 50) {
            System.out.println(produto + " - R$" + (produto * precoProduto));
            produto++;
        }
        
        leia.close();
    }
}
