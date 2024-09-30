import java.util.Scanner;

public class Ex03_24 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int cd;
        double valor, media;
        double total = 0;
        
        System.out.print("Informe a Quantidade de CD's na Coleção: ");
        cd = leia.nextInt();
        
        
        for (int i = 1; i <= cd; i++) {
            System.out.print("Informe o Valor do " + i + "º CD: R$");
            valor = leia.nextDouble();
            total += valor;
        }
        
        media = total / cd;
        System.out.println("\nValor Total Investido: R$" + total);
        System.out.println("Valor Médio Gasto por CD: R$" + media);
        
        leia.close();
    }
}
