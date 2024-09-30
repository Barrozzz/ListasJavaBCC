import java.util.Scanner;

public class Ex03_02 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        String nome, senha;

        do {
            System.out.print("Digite o Nome de Usuário: ");
            nome = leia.next();
            System.out.print("Digite a Senha: ");
            senha = leia.next();
            if (nome.equals(senha)) {
                System.out.println("Senha Não Pode ser Igual ao Usuário\n");
            }
        } while (nome.equals(senha));

        System.out.println("\nUsuário e Senha Válidos");
        
        leia.close();
    }
}
