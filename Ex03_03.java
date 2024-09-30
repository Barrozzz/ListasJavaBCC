import java.util.Scanner;

public class Ex03_03 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        String nome;
        char sexo, ec;
        int idade;
        double salario;

        do {
            System.out.print("\nDigite o nome (Mais de 3 Caracteres): ");
            nome = leia.next();
        } while (nome.length() <= 3);

        do {
            System.out.print("\nDigite a Idade (entre 0 e 150): ");
            idade = leia.nextInt();
        } while (idade < 0 || idade > 150);

        do {
            System.out.print("\nDigite o Salário (Maior que 0): ");
            salario = leia.nextDouble();
        } while (salario <= 0);
        
        leia.nextLine();

        do {
            System.out.print("\nDigite o sexo (F ou M): ");
            sexo = leia.nextLine().charAt(0);
        } while (sexo != 'f' && sexo != 'F' && sexo != 'm' && sexo != 'M');

        do {
            System.out.print("\nDigite o Estado Civil (S, C, V, D): ");
            ec = leia.nextLine().charAt(0);
        } while (ec != 's' && ec != 'S' && ec != 'c' && ec != 'C' &&
        		ec != 'v' && ec != 'V' && ec != 'd' && ec != 'D');

        System.out.println("\nInformações Válidas");
        leia.close();
    }
}
