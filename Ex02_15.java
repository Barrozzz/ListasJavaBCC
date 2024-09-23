import java.util.Scanner;

public class Ex02_15 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double precoCusto;
        int codigo;

        System.out.print("Informe o preço de custo do produto: R$");
        precoCusto = leia.nextDouble();
        System.out.print("\n1 - Sul | 2 - Norte | 3 - Leste | 4 - Oeste \n5/6 - Nordeste | 7/8 - Centro-Oeste\nRegião: ");
        codigo = leia.nextInt();

        switch (codigo) {
            case 1: System.out.println("Sul | Preço: R$" + precoCusto); break;
            case 2: System.out.println("Norte | Preço: R$" + precoCusto); break;
            case 3: System.out.println("Leste | Preço: R$" + precoCusto); break;
            case 4: System.out.println("Oeste | Preço: R$" + precoCusto); break;
            case 5: case 6: System.out.println("Nordeste | Preço: R$" + precoCusto); break;
            case 7: case 8: System.out.println("Centro-oeste | Preço: R$" + precoCusto); break;
            default: System.out.println("Importado | Preço: R$" + precoCusto); break;
        }

        leia.close();
    }
}
