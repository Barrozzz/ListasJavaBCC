import java.util.Scanner;

public class Ex03_27 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double preco, total, dinheiro, troco;
        int produto;

        produto = 1;
        total = 0;
        
        while (true) {
            System.out.print("Produto " + produto + ": R$");
            preco = leia.nextDouble();
            if (preco == 0) {
            	break;
            }
            total += preco;
            produto++;
        }
        
        System.out.println("\nTotal: R$" + total);
        System.out.print("Dinheiro: R$");
        dinheiro = leia.nextDouble();
        
        troco = dinheiro - total;
        System.out.println("\nTroco: R$" + troco);
        
        leia.close();
    }
}
